package com.bl.add_book;

import java.util.Scanner;

public class MainAddBook {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program !!");

        // Object creation and Scanner class
        Contacts person = new Contacts();
        Scanner scan = new Scanner(System.in);
        // Setting and Getting the value
        System.out.println("Enter First Name:-");
        person.setFirstName(scan.nextLine());
        String firstName = person.getFirstName();

        System.out.println("Enter Last Name:-");
        person.setLastName(scan.nextLine());
        String lastname = person.getLastName();

        System.out.println("Enter Address:-");
        person.setAddress(scan.nextLine());
        String address = person.getAddress();

        System.out.println("Enter City Name:-");
        person.setCityName(scan.nextLine());
        String cityName = person.getCityName();

        System.out.println("Enter State:-");
        person.setState(scan.nextLine());
        String state = person.getState();

        System.out.println("Enter Zip Pin:-");
        person.setZipNum(scan.nextLine());
        String zipNum = person.getZipNum();

        System.out.println("Enter Phone Number:-");
        person.setPhoneNum(scan.nextLine());
        String phoneNum = person.getPhoneNum();

        System.out.println("Enter Email Id:-");
        person.setEmail_Id(scan.nextLine());
        String email_Id = person.getEmail_Id();

        // Print the values who,s taking from Console
        System.out.println(firstName + "  " + lastname + "  " + address + "  " + cityName + "  " + state + "  " + zipNum + "  " + phoneNum + "  11" + email_Id);

    }
}
