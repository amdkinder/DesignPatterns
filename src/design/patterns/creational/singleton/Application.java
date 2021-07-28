/*
 * Copyright (c)  2021 Kuchkarov Ahrorbek.
 * All rights reserved
 */

package design.patterns.creational.singleton;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application started...");
        Database db = Database.getInstance();
        db.query("SELECT * FROM user;");

        Database db2 = Database.getInstance();
        db2.query("SELECT * FROM auth;");
    }
}
