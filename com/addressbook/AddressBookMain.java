package com.addressbook;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");
		Dictionary dictionary = new Hashtable();
		System.out.println("Enter number of addressBooks U want to create");
		Scanner sc = new Scanner(System.in);
		int numOfAddressBooks = sc.nextInt();
		for (int i = 0; i < numOfAddressBooks; i++) {
			System.out.println("Enter Name of Address Book");
			String name = sc.nextLine();

			AddressBook addressBook = new AddressBook();

			ContactStore contactStore = new ContactStore();
			UserInterface userInterface = new UserInterface();
			boolean check = true;
			while (check) {
				System.out.println(
						"Enter choise 1.Add the new contact\n 2.Edit Existing Contact\n 3.Remove the Contact\n 4.exit");
				int choise = sc.nextInt();
				sc.nextLine();
				switch (choise) {
				case 1:
					AddressBook newContact = new AddressBook();
					userInterface.addNewContact(addressBook);
					contactStore.add(addressBook);
					System.out.println("Contact List After Adding");
					userInterface.print(contactStore.getContactList());

				case 2:
					contactStore.edit();
					System.out.println("Contact List After Edit");
					userInterface.print(contactStore.getContactList());

				case 3:
					contactStore.remove();
					System.out.println("Contact List after Deletion");
					userInterface.print(contactStore.getContactList());

				case 4:
					check = false;
				}

				dictionary.put(name, addressBook);
			}
		}
	}
}
