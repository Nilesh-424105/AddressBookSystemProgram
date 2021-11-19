package com.addressbook;

import java.util.*;

public class AddressBookMain {
	static Hashtable<Integer, ArrayList<ContactStore>> dictionary = new Hashtable<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {	
		System.out.println("Welcome to Address Book Program");
		System.out.println("Enter number of addressBooks");
		int addresssBookLimit = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i < addresssBookLimit; i++) {
			ArrayList<ContactStore> arrayList = new ArrayList<ContactStore>();
			boolean check = true;
			while (check) {
				ContactStore contactStore = new ContactStore();
				System.out.println("Enter choise 1.Add the new contact\n 2.Edit Existing Contact\n 3.Remove the Contact\n 4.exit");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					contactStore.setContactDetails();
					boolean checkDuplicate = contactStore.searchForDuplication(arrayList, contactStore);
					if(!checkDuplicate)
						arrayList.add(contactStore);
					else
						System.out.println("Contact already Exists");
				case 2:
					contactStore.editContact(arrayList);
				case 3:
					contactStore.deleteContact(arrayList);
				case 4:
					check = false;
				}
			}
			 dictionary.put(i, arrayList);
		}
		System.out.println(dictionary);
        ContactStore.search(dictionary);
        System.out.println("AddressBooks after Sorting: ");
        ContactStore.sort(dictionary);
	}
}
