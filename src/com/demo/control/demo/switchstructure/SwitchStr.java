package com.demo.control.demo.switchstructure;

public class SwitchStr {

	public static void main(String[] args) {
		System.out.println("Hello!");

		String gender = "FEMALE";

		switch (gender) {
			case "FEMALE":
				System.out.println("The gender is  FEMALE");
				break;
		
			case "MALE":
			System.out.println("The gender is  MALE");
				break;

			case "NOT_TO_SAY":
				System.out.println("PREFER NOT TO SAY");
				break;	

			default:
				System.out.println("NOT DEFINE IN OPTIONS");
				break;
		}




	}

}
