package com.bl.add_book;

public class Contacts {

    // Variable Declaration
    private String firstName;
    private String lastName;
    private String address;
    private String cityName;
    private String state;
    private String zipNum;
    private String phoneNum;
    private String email_Id;


    // Generating Getters And Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipNum() {
        return zipNum;
    }

    public void setZipNum(String zipNum) {
        this.zipNum = zipNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail_Id() {
        return email_Id;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    // Generating Constructor
    public Contacts(String firstName, String lastName, String address, String cityName, String state, String zipNum, String phoneNum, String email_Id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cityName = cityName;
        this.state = state;
        this.zipNum = zipNum;
        this.phoneNum = phoneNum;
        this.email_Id = email_Id;
    }

    // Non Parametrised Constructor
    public Contacts(){

    }

    //Generating to String Method
    @Override
    public String toString() {
        return "Contacts{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", cityName='" + cityName + '\'' + ", state='" + state + '\'' + ", zipNum='" + zipNum + '\'' + ", phoneNum='" + phoneNum + '\'' + ", email_Id='" + email_Id + '\'' + '}';
    }
}
