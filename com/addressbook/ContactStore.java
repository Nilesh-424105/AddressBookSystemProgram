package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactStore {

	private ArrayList<AddressBook> contactList = new ArrayList<AddressBook>();
	Scanner sc = new Scanner(System.in);

	public ArrayList<AddressBook> getContactList() {
		return contactList;

	}

	public void add(AddressBook contact) {
		contactList.add(contact);
	}

	public void edit() {
		System.out.println("Enter name of contact you want to sell");
		String name = sc.nextLine();
		for (AddressBook addressBook : contactList) {
			if (addressBook.getFirstName().equalsIgnoreCase(name)) {
				boolean check = true;
				while (check) {
					System.out.println(
							"Edit Options 1.FirstName 2.LastName 3.Address 4.City 5.State 6.PhoneNumber 7.Email");
					int choise = sc.nextInt();
					sc.nextLine();
					switch (choise) {
					case 1:
						System.out.println("Enter your new FirstName:");
						String firstName = sc.nextLine();
						addressBook.setFirstName(firstName);

					case 2:
						System.out.println("Enter your new Last Name:");
						String lastName = sc.nextLine();
						addressBook.setLastName(lastName);

					case 3:
						System.out.println("Enter your new Address:");
						String address = sc.nextLine();
						addressBook.setAddress(address);

					case 4:
						System.out.println("Enter your new City:");
						String city = sc.nextLine();
						addressBook.setCity(city);

					case 5:
						System.out.println("Enter your new State:");
						String state = sc.nextLine();
						addressBook.setState(state);

					case 6:
						System.out.println("Enter your new Zip:");
						String zip = sc.nextLine();
						addressBook.setZip(zip);

					case 7:
						System.out.println("Enter your new PhoneNumber:");
						String phoneNumber = sc.nextLine();
						addressBook.setPhoneNumber(phoneNumber);

					case 8:
						System.out.println("Enter your new Email:");
						String email = sc.nextLine();
						addressBook.setEmail(email);

					default:
						check = false;
					}
				}
			}
		}
	}

	public void remove() {
		System.out.println("Enter name of contact you want to sell");
		String name = sc.nextLine();
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.remove(contactList.get(i)))
				;
		}
	}
}
