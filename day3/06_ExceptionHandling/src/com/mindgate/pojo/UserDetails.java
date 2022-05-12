package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UserDetails {
	private String userid;
	private String name;
	private int age;

	public void accecptUserDetails() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter UserId");
			userid = scanner.next();
			System.out.println("Enter User Name");
			name = scanner.next();
			// scanner.nextLine();
			System.out.println("Enter User Age");
			age = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Input From User");
			System.out.println("Please Enter Valid values");
		} finally {
			System.out.println("Details accepeted!");
			scanner.close();
		}

	}

	public void displayUserDetails() {
		System.out.println(userid);
		System.out.println(name);
		System.out.println(age);
	}

}
