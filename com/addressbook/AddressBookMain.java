package com.addressbook;

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
		userInterface.print(contactStore.getContactList());
	}
}
