package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UserDetailsMain {

	public static void main(String[] args) {
		System.out.println("main start");
		UserDetails details = new UserDetails();
		details.accecptUserDetails();
		details.displayUserDetails();
		System.out.println("main end");
		try {
			Class.forName("com.mindgate.pojo.UserDetails");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
   