/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.singleton;

public class Database {

    public static Database instance;

    public Database() {

    }

    public static Database getInstance() {
        if (Database.instance == null) {
            System.out.println("Database not connected.");
            Database.instance = new Database();
            System.out.println("Database connected...");
        }
        return Database.instance;
    }

    public void query(String query) {
        System.out.println(query);
    }
}
