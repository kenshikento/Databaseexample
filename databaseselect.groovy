package com.database

import groovy.json.JsonBuilder
import groovy.sql.Sql

class databaseselect {

    static void main(String[] args) {

        def sql = null;
        def url = 'jdbc:mysql://localhost:3306/shopcart?useLegacyDatetimeCode=false&serverTimezone=UTC';
        def driver = 'com.mysql.cj.jdbc.Driver';
        def user = 'root';
        def password = '';
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            sql = Sql.newInstance(url, user, password, driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
         def insertsql = 'SELECT * FROM customer';
        /* def insertsql = 'SELECT * FROM customer WHERE name= ? and id = ?'; Example of variables input // Should always have input as vulnerable to attack still
         def params = ['ken', '1'];*/

        def jsonbuilder = new JsonBuilder();
         sql.eachRow(insertsql) {
                  tp ->
                      def root = jsonbuilder name:tp.name, email:tp.email, phonenum:tp.phonenum;

              }
             // println writer.toString()
              println  jsonbuilder.toPrettyString();



    }

}
