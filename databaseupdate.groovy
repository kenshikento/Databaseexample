package com.database

import groovy.sql.Sql

class databaseselect {
    static void main (String[] args) {

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
            sql = Sql.newInstance(url, user, password, driver);
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        def insertsql = 'UPDATE customer SET email= ?, phonenum = ?)WHERE id = ? AND name =?';
        def params =['tien.com','21321312','1','']

    }
}
