package com.harrybro.designpattern.structural.facade;

import java.sql.Connection;

public class OracleHelper implements DbHelper {

    public Connection getConnection() {
        return null;
    }

    public void generatePdfReport(String tableName, Connection connection) {

    }

    public void generateHtmlReport(String tableName, Connection connection) {

    }

}
