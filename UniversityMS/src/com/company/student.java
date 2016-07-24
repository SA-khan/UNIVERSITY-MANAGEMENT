package com.company;

import java.util.Scanner;

/**
 * Created by saad on 7/19/2016.
 */
public class student {
    public static int count=0;
    public static String[] students = new String[30];
    private String firstName;
    private String lastName;
    private String seatNumber;
    private String fatherName;
    public void setFirstName(String fname){
       firstName = fname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public student(){

    }


    public student(String finame, String laname, String faname, String senumber){

       firstName = finame;
        lastName = laname;
        seatNumber = senumber;
        fatherName = faname;
        System.out.println(this);
        students[count]=finame + " "+laname+" "+faname+" "+senumber;
        count++;
    }
    public void Display() {
        //System.out.println(getFirstName()+" "+getLastName()+" "+getFatherName()+" "+getSeatNumber() );
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null)
                System.out.println(students[i]);
        }
    }
    public void Delete(String seat){

        for(int i=0;i<students.length;i++){
            try {
                if (students[i].endsWith(seat)) {
                    students[i] = null;
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void update(String seat){

        for(int i=0;i<students.length;i++){
            try {
                if (students[i].endsWith(seat)) {
                    Scanner text = new Scanner(System.in);
                    System.out.println("Enter the student updated first name: ");
                    String updatedfname = text.next();
                    System.out.println("Enter the student updated last name: ");
                    String updatedlname = text.next();
                    System.out.println("Enter the student updated father's name: ");
                    String updatedfaname = text.next();
                    System.out.println("Enter the student updated seat number: ");
                    String updatedsenumber = text.next();
                    students[i] = updatedfname+" "+updatedlname+" "+updatedfaname+" "+updatedsenumber;
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
