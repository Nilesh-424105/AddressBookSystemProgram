package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Program");
		
		AddressBook contact = new AddressBook();
		contact.setFirstName("Nilesh");
		contact.setLastName("Kotkar");
		contact.setAddress("12/15, abcd colony, efgh nagar");
		contact.setCity("Jalgaon");
		contact.setState("Maharastra");
		contact.setZip("425215");
		contact.setPhoneNumber("8766483622");
		contact.setEmail("nilesh4526@gmail.com");
		
		ContactStore contactStore = new ContactStore();
		contactStore.add(contact);
		
		UserInterface userInterface = new UserInterface();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("Enter choise 1.Add the new contact\n 2.Edit Existing Contact\n 3.exit");
			int choise = sc.nextInt();
			switch(choise) {
			case 1:
				AddressBook newContact = new AddressBook();
				userInterface.addNewContact(newContact);
				contactStore.add(newContact);
				System.out.println("Contact List After Add");
				userInterface.print(contactStore.getContactList());
				
			case 2:
				contactStore.edit();
				System.out.println("Contact List After Edit");
				userInterface.print(contactStore.getContactList());
				
			case 3:
				check = false;
			}
			
				
				
		}
	}
}
