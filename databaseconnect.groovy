package com.database

import groovy.sql.Sql



public class databaseconnect {
    static void main (String[] args){


    def url = 'jdbc:mysql://localhost:3306/shopcart?useLegacyDatetimeCode=false&serverTimezone=UTC';
    def driver = 'com.mysql.cj.jdbc.Driver';
    def user = 'root';
    def password = '';
    def sql = Sql.newInstance(url, user, password, driver)


        sql.eachRow('SELECT VERSION()'){ row ->
            println row[0]
        }

    sql.close();

    }


}

