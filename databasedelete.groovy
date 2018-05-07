package com.database

import groovy.sql.Sql

class databasedelete {
    static void main (String[] args){

        def sql = null;
        def url = 'jdbc:mysql://localhost:3306/shopcart?useLegacyDatetimeCode=false&serverTimezone=UTC';
        def driver = 'com.mysql.cj.jdbc.Driver';
        def user = 'root';
        def password = '';

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            sql = Sql.newInstance(url, user, password, driver)
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        def deletesql = 'DELETE FROM  customer WHERE id=? AND name=?'
        // Example of input
        def params = [10,'apps']
        try {
            def keys = sql.execute(deletesql,params)
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

    }
}
