package com.database

import groovy.sql.Sql

class databaseinsert {
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

        def insertsql = 'INSERT INTO customer(name,email,phonenum)VALUE(?,?,?)'
        // Example of input
        def params = ['apps','apps@hotmail.com',12321321]
        try {
            def keys = sql.executeInsert(insertsql,params)
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

    }
}
