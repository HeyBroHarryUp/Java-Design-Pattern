package com.harrybro.designpattern.structural.facade;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        String tableName="Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        MySqlHelper mySqlHelper = new MySqlHelper();
        Connection con = mySqlHelper.getConnection();
        mySqlHelper.generateHtmlReport(tableName, con);

        OracleHelper oracleHelper = new OracleHelper();
        Connection con1 = oracleHelper.getConnection();
        oracleHelper.generatePdfReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        DbReportGenerator.generateReport(DbType.MYSQL, ReportType.HTML, tableName);
        DbReportGenerator.generateReport(DbType.ORACLE, ReportType.PDF, tableName);
    }

}
