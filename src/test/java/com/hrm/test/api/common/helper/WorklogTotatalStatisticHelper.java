package com.hrm.test.api.common.helper;

import com.hrm.test.api.calls.PeopleAPI;
import com.hrm.test.api.calls.WorklogAPI;
import com.hrm.test.api.data.model.calendar.CalendarParticularPersonResponse;
import com.hrm.test.api.data.model.person_statistics.PersonStatisticsParamsResponse;
import com.hrm.test.api.data.model.work_statistics.TotalWorkStatisticsResponse;

import java.time.LocalDate;

import static com.hrm.test.api.common.init.TestBase.logStep;

public class WorklogTotatalStatisticHelper {
    private String token;
    public WorklogTotatalStatisticHelper(String token){
        this.token=token;
    }
    public TotalWorkStatisticsResponse calculateWorklogTotalStatistics(){
        //videti podatke People/Profile
        PersonStatisticsParamsResponse res=new PersonStatisticsParamsResponse();
        int startMonth=11;
        int startYear=2020;
        double sumHours=0.0;
        LocalDate currentdate = LocalDate.now();
        while(startYear<currentdate.getYear() || (startMonth<=currentdate.getMonthValue() && startYear==currentdate.getYear())){
            String date=startYear+"-"+(startMonth<10 ? "0"+startMonth:startMonth)+"-1";
            res= PeopleAPI.createPersonStatisticsParamsResponse(token,"513",date);

            sumHours+=res.getCurrentMonthHours();
            startMonth++;
            if(startMonth==13){
                startYear++;
                startMonth=1;
            }

        }


        CalendarParticularPersonResponse excludingDayResponse= WorklogAPI.createCalendarParticularPersonResponse(token,"513",currentdate.toString());
        logStep("INFO:Because we are excluding today statistics from the worklog we must subtract that amount of time");

        double diff=excludingDayResponse.getPersonLoggingStatuses().stream().filter(el->
                {

                    String help1=el.toString().split("StartTime=")[1].split("T")[0];
                    String help2=el.toString().split("EndTime=")[1].split("T")[0];
                    return  help1.equals(currentdate.toString()) || help2.equals(currentdate.toString());
                }
        ).
                mapToDouble(el -> Double.parseDouble(el.toString().split("TotalTime=")[1].split(",")[0])).sum();

        sumHours-=diff;
        int receivedHours=(int)sumHours;
        int receivedMinutes=(int)((sumHours-receivedHours)*60);
        String totalWorkHours=receivedHours+"h "+receivedMinutes+"m";
        int totalWorkingDaysCount=res.getWorkingDaysCount()-1;
        double averageHours=sumHours/totalWorkingDaysCount;
        int intHours= (int) averageHours;
        String avgDailyHours=intHours+"h "+((int)((averageHours-intHours)*60))+"m";
        TotalWorkStatisticsResponse expectedResponse=new TotalWorkStatisticsResponse(totalWorkHours,totalWorkingDaysCount,avgDailyHours);
        return expectedResponse;
    }
}
