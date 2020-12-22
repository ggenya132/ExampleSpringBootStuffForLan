package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient  {

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(Long patient_ID) {
        Patient_ID = patient_ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip_Code() {
        return Zip_Code;
    }

    public void setZip_Code(String zip_Code) {
        Zip_Code = zip_Code;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String date_of_Birth) {
        Date_of_Birth = date_of_Birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getSocial_security_Number() {
        return Social_security_Number;
    }

    public void setSocial_security_Number(String social_security_Number) {
        Social_security_Number = social_security_Number;
    }

    public String getMarital_Status() {
        return Marital_Status;
    }

    public void setMarital_Status(String marital_Status) {
        Marital_Status = marital_Status;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getInsurance_Provider() {
        return Insurance_Provider;
    }

    public void setInsurance_Provider(String insurance_Provider) {
        Insurance_Provider = insurance_Provider;
    }

    @Id
    @GeneratedValue
    private Long Patient_ID;
    private String Address;
    private String City;
    private String State;
    private String Zip_Code;
    private String Date_of_Birth;
    private String Gender;
    private String Social_security_Number;
    private String Marital_Status;
    private String Phone;
    private String Insurance_Provider;

    public Patient(String name, String address, String city, String state, String zip_Code, String date_of_Birth, String gender, String social_security_Number, String marital_Status, String phone, String insurance_Provider) {
        Name = name;
        Address = address;
        City = city;
        State = state;
        Zip_Code = zip_Code;
        Date_of_Birth = date_of_Birth;
        Gender = gender;
        Social_security_Number = social_security_Number;
        Marital_Status = marital_Status;
        Phone = phone;
        Insurance_Provider = insurance_Provider;
    }
    public Patient(){}
}