package com.harrybro.designpattern.structural.facade;

import java.sql.Connection;

public class DbReportGenerator {

    public static void generateReport(DbType dbType, ReportType reportType, String tableName) {
        Connection con;
        switch (dbType) {
            case MYSQL:
                MySqlHelper mySqlHelper = new MySqlHelper();
                con = mySqlHelper.getConnection();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateHtmlReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generatePdfReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                OracleHelper oracleHelper = new OracleHelper();
                con = oracleHelper.getConnection();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateHtmlReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generatePdfReport(tableName, con);
                        break;
                }
                break;
        }
    }

}
