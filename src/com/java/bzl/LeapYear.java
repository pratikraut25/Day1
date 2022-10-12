package com.java.bzl;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter any year: ");
     int year = scan.nextInt();
     if(year%100==0 && year%400==0  || year%100!=0 && year%4==0)
     {
    	 System.out.println("Leap year");
     }
     else{
    	 System.out.println("Not Leap year");

    	 
     }
     
     
	}

}
