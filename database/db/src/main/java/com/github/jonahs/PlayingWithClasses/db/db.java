/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.PlayingWithClasses.db;

import java.sql.SQLException;

/**
 *
 * @author god
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author god
 */
public class db extends defaultdb {

    /**
     *
     */
    public static String DEFAULT_DB = "Bands.db";

    /**
     *
     */
    public static String DEFAULT_URL = "jdbc:sqlite:" + DEFAULT_DB;

    db() {
        this(DEFAULT_URL);
    }

    db(String url) {
        setURL(url);
    }

    void reset() throws SQLException {
        sql("drop table if exists band");
        sql("create table band (id integer primary key, name string)");
    }

    long insertBand(String name) throws SQLException {
        return longResult(sql("insert into band (name) values (?)", name));
    }

    String getBand(long id) throws SQLException {
        return stringResult(sql("select name from band where id=?", id));
    }

    void run() throws SQLException {
        reset();
        long AliceInChainsId = insertBand("Alice in Chains");
        System.out.println("Alice Id=" + AliceInChainsId);
        long ACDCId = insertBand("ACDC");
        System.out.println("ACDC name=" + getBand(AliceInChainsId));
    }

}
