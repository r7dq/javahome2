
package com.mycompany.homwork3;

public class Homwork3 {
    public static void main(String[] args) {
        WorkshopRegistration wr = new WorkshopRegistration();
    try {
        wr.registerParticipant("ahmed", 17);
    }
    catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
    }
}}