/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users;

/**
 *
 * @author nahid
 */
import com.hotel.Hotel;

public class Manager extends Account {
    private Hotel hotel;
    private final String ACCESSKEY = "akachukwu123";

    public Manager(String name, int accountId, String emailId){
        super(name, accountId, emailId);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getACCESSKEY() {
        return ACCESSKEY;
    }
}
