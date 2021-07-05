package com.harrybro.designpattern.structural.facade;

import java.sql.Connection;

public interface DbHelper {

    Connection getConnection();

    void generatePdfReport(String tableName, Connection connection);

    void generateHtmlReport(String tableName, Connection connection);

}
