package com.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Program");
		
		AddressBook contact = new AddressBook();
		ContactStore contactStore = new ContactStore();
		contactStore.add(contact);
		
		UserInterface userInterface = new UserInterface();
		userInterface.addNewContact(contact);
		userInterface.print(contactStore.getContactList());
	}
}
