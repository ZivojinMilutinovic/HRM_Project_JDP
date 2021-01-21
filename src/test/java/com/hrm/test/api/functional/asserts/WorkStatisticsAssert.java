package com.hrm.test.api.functional.asserts;

import com.hrm.test.api.data.model.work_statistics.WorkStatisticsResponse;
import org.testng.asserts.SoftAssert;

public class WorkStatisticsAssert {
    private SoftAssert softAssert;
    public WorkStatisticsAssert(){
        softAssert=new SoftAssert();
    }
    public void assertCreatedNoEqual(WorkStatisticsResponse actualTotalWorkStatistics, WorkStatisticsResponse expectedTotalWorkStatistics)
    {
        this.softAssert.assertEquals(actualTotalWorkStatistics.getWeekAverageWorkHours(),expectedTotalWorkStatistics.getWeekAverageWorkHours());
        this.softAssert.assertEquals(actualTotalWorkStatistics.getDate(),expectedTotalWorkStatistics.getDate());
        this.softAssert.assertEquals(actualTotalWorkStatistics.getDayWorkHourSum(),expectedTotalWorkStatistics.getDayWorkHourSum());
        this.softAssert.assertEquals(actualTotalWorkStatistics.getMonthWorkHourSum(),expectedTotalWorkStatistics.getMonthWorkHourSum());
        this.softAssert.assertEquals(actualTotalWorkStatistics.getWeekWorkHourSum(),expectedTotalWorkStatistics.getWeekWorkHourSum());
        this.softAssert.assertEquals(actualTotalWorkStatistics.getWeekAverageWorkHoursNum(),expectedTotalWorkStatistics.getWeekAverageWorkHoursNum());
        this.softAssert.assertAll();
    }
}
