package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner text = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Enter Your choice: ");
            System.out.println("Enter 1 to Enter New Student Data ");
            System.out.println("Enter 2 to View Student Data ");
            System.out.println("Enter 3 to Delete Student Data ");
            System.out.println("Enter 4 to Update Student Data ");
            System.out.println("Enter 5 to Enter New Teacher Data ");
            System.out.println("Enter 6 to View Teachers Data ");
            System.out.println("Enter 7 to Delete Teacher Data ");
            System.out.println("Enter 8 to Update Teacher Data ");
            choice = text.nextInt();
            if (choice == 1) {
                System.out.println("FirstName: ");
                String fname = text.next();
                System.out.println("LastName: ");
                String lastname = text.next();
                System.out.println("SeatNumber: ");
                String seatnumber = text.next();
                System.out.println("FatherName: ");
                String fathername = text.next();/*
                students[count] = fname+" "+lastname+" "+fathername+" "+seatnumber;*/
                student mystudent = new student(fname, lastname, fathername, seatnumber);

            } else if (choice == 2) {
                //student mystudent = new student(fname,lastname, seatnumber, fathername );
                //mystudent.toString();
                student mystudent = new student();
                mystudent.Display();

            } else if (choice == 3) {
                System.out.println("Enter the SeatNumber: ");
                String seatNumberDelete = text.next();
                student mystudent = new student();
                mystudent.Delete(seatNumberDelete);
            }
            else if(choice==4){
                System.out.println("Enter the SeatNumber: ");
                String seatNumberDelete = text.next();
                student mystudent = new student();
                mystudent.update(seatNumberDelete);
            }
            else if (choice == 5) {
                System.out.println("FirstName: ");
                String fname = text.next();
                System.out.println("LastName: ");
                String lastname = text.next();
                System.out.println("SocialSecurityNumber: ");
                String senumber = text.next();
                System.out.println("FatherName: ");
                String fathername = text.next();/*
                students[count] = fname+" "+lastname+" "+fathername+" "+seatnumber;*/
                teacher myteacher = new teacher(fname, lastname, fathername, senumber);

            }
            else if (choice == 6) {
                //student mystudent = new student(fname,lastname, seatnumber, fathername );
                //mystudent.toString();
                teacher myteacher = new teacher();
                myteacher.Display();

            }
            else if (choice == 7) {
                System.out.println("Enter the SocialSecurityNumber: ");
                String seNumberDelete = text.next();
                teacher myteacher = new teacher();
                myteacher.Delete(seNumberDelete);
            }
            else if(choice==8){
                System.out.println("Enter the SocialSecurityNumber: ");
                String seNumberDelete = text.next();
                teacher myteacher = new teacher();
                myteacher.Delete(seNumberDelete);
            }
        }
            while (choice != 9) ;

    }
}