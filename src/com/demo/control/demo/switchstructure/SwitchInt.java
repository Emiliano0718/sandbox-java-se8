package com.demo.control.demo.switchstructure;

public class SwitchInt {

	public static void main(String[] args) {
		System.out.println("Hello!");

		int value = 0;

		switch (value) {
			case 5:
			case 6:
				System.out.println("The gender is  FEMALE");
				break;
		
			case 10:
			case 11:
			System.out.println("The gender is  MALE");
				break;

			case 20:	
			case 25:
				System.out.println("PREFER NOT TO SAY");
				break;	

			default:
				System.out.println("NOT DEFINE IN OPTIONS");
				break;
		}




	}

}
