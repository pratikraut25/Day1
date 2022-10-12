package com.java.bzl;
import java.util.Scanner;
public class TwoString {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter First String: ");
     String str1 = sc.nextLine();
     System.out.println("Enter Second String: ");
     String str2 = sc.nextLine();
     if(str1.equals(str2))
    	 System.out.println("Both Strings Are Equal. ");
	else{
		 System.out.println("Strings Are Not Equal.");
	}

}
}