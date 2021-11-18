package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	
	ArrayList<AddressBook> contactList;
	
	public void print(ArrayList<AddressBook> arrayList) {
		for (AddressBook s : arrayList) {
			System.out.println(s);
		}
	}

	public void addNewContact(AddressBook contactThree) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		contactThree.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name");
		contactThree.setLastName(sc.nextLine());
		System.out.println("Enter Address");
		contactThree.setAddress(sc.nextLine());
		System.out.println("Enter City");
		contactThree.setCity(sc.nextLine());
		System.out.println("Enter State");
		contactThree.setState(sc.nextLine());
		System.out.println("Enter Zip Code");
		contactThree.setZip(sc.nextLine());
		System.out.println("Enter PhoneNumber");
		contactThree.setPhoneNumber(sc.nextLine());
		System.out.println("Enter Email");
		contactThree.setEmail(sc.nextLine());
		sc.close();
	}
}
