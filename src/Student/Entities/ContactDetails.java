/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.Entities;

import java.util.ArrayList;

/**
 *
 * @author RICK
 */
public class ContactDetails {
    private String streetLine1;
    private String streetLine2;
    private String city;
    private String parish;
    
    private ArrayList<PhoneNumber> numberList;
    private ArrayList<Email> emailList;

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public ArrayList<PhoneNumber> getNumberList() {
        return numberList;
    }

    public void setNumberList(ArrayList<PhoneNumber> numberList) {
        this.numberList = numberList;
    }

    public ArrayList<Email> getEmailList() {
        return emailList;
    }

    public void setEmailList(ArrayList<Email> emailList) {
        this.emailList = emailList;
    }

}