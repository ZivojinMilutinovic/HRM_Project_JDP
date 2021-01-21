package com.hrm.test.api.functional.asserts;

import com.hrm.test.api.data.model.work_statistics.TotalWorkStatisticsResponse;
import org.testng.asserts.SoftAssert;

public class TotalWorkStatisticsAssert {
    private SoftAssert softAssert;
    public TotalWorkStatisticsAssert(){
        softAssert=new SoftAssert();
    }
    public void assertCreatedNoEqual(TotalWorkStatisticsResponse actualTotalWorkStatistics,TotalWorkStatisticsResponse expectedTotalWorkStatistics)
    {
        this.softAssert.assertEquals(actualTotalWorkStatistics.getTotalWorkDays(),expectedTotalWorkStatistics.getTotalWorkDays());
        this.softAssert.assertEquals(actualTotalWorkStatistics.getAverageDailyWorkHours(),expectedTotalWorkStatistics.getAverageDailyWorkHours());
        this.softAssert.assertEquals(actualTotalWorkStatistics.getTotalWorkHours(),expectedTotalWorkStatistics.getTotalWorkHours());
        this.softAssert.assertAll();
    }

}
