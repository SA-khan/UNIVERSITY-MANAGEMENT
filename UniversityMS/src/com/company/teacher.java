package com.company;

import java.util.Scanner;

/**
 * Created by saad on 7/19/2016.
 */
public class teacher {
    public static int count=0;
    public static String[] teachers = new String[30];
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public teacher(){

    }


    public teacher(String finame, String laname, String faname, String senumber){

        firstName = finame;
        lastName = laname;
        socialSecurityNumber = senumber;
        fatherName = faname;
        System.out.println(this);
        teachers[count]=finame + " "+laname+" "+faname+" "+senumber;
        count++;
    }
    public void Display() {
        //System.out.println(getFirstName()+" "+getLastName()+" "+getFatherName()+" "+getSeatNumber() );
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null)
                System.out.println(teachers[i]);
        }
    }
    public void Delete(String seat){

        for(int i=0;i<teachers.length;i++){
            try {
                if (teachers[i].endsWith(seat)) {
                    teachers[i] = null;
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void update(String seat){

        for(int i=0;i<teachers.length;i++){
            try {
                if (teachers[i].endsWith(seat)) {
                    Scanner text = new Scanner(System.in);
                    System.out.println("Enter the teacher's updated first name: ");
                    String updatedfname = text.next();
                    System.out.println("Enter the teacher updated last name: ");
                    String updatedlname = text.next();
                    System.out.println("Enter the teacher updated father's name: ");
                    String updatedfaname = text.next();
                    System.out.println("Enter the teacher updated social Security number: ");
                    String updatedsenumber = text.next();
                    teachers[i] = updatedfname+" "+updatedlname+" "+updatedfaname+" "+updatedsenumber;
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
