package com.addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContactStore extends AddressBook {
	Scanner sc = new Scanner(System.in);

	public void setContactDetails() {
		System.out.println("enter the First Name");
		setFirstName(sc.nextLine());
		System.out.println("enter the Last Name");
		setLastName(sc.nextLine());
		System.out.println("enter the Address Name");
		setAddress(sc.nextLine());
		System.out.println("Enter city");
		setCity(sc.nextLine());
		System.out.println("enter the State Name");
		setState(sc.nextLine());
		System.out.println("enter the Phone Number");
		setPhoneNumber(sc.nextLine());
		System.out.println("enter the ZipCode");
		setZip(sc.nextLine());
		System.out.println("enter the Email");
		setEmail(sc.nextLine());
	}

	public void editContact(ArrayList<ContactStore> contact) {
		System.out.println("Enter name of contact to Edit");
		String name = sc.nextLine();
		for (int i = 0; i < contact.size(); i++) {
			if (contact.get(i).getFirstName().equals(name)) {
				boolean check = true;
				while (check) {
					System.out.println("Enter 1.FirstName 2.LastName 3.Address 4.City 5.State 6.PhoneNumber 7.Email");
					int choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
					case 1:
						System.out.println("Enter your FirstName:");
						String firstName = sc.nextLine();
						contact.get(i).setFirstName(firstName);
						break;
					case 2:
						System.out.println("Enter your Last Name:");
						String lastName = sc.nextLine();
						contact.get(i).setLastName(lastName);
						break;
					case 3:
						System.out.println("Enter your Address:");
						String address = sc.nextLine();
						contact.get(i).setAddress(address);
						break;
					case 4:
						System.out.println("Enter your City:");
						String city = sc.nextLine();
						contact.get(i).setCity(city);
						break;
					case 5:
						System.out.println("Enter your State:");
						String state = sc.nextLine();
						contact.get(i).setState(state);
						break;
					case 6:
						System.out.println("Enter your Zip:");
						String zip = sc.nextLine();
						contact.get(i).setZip(zip);
						break;
					case 7:
						System.out.println("Enter your PhoneNumber:");
						String phoneNumber = sc.nextLine();
						contact.get(i).setPhoneNumber(phoneNumber);
						break;
					case 8:
						System.out.println("Enter your Email:");
						String email = sc.nextLine();
						contact.get(i).setEmail(email);
						break;
					default:
						check = false;
					}
				}
			} else
				System.out.println("Your name is not matched");
		}
	}

	public void deleteContact(ArrayList<ContactStore> contact) {
		System.out.println("Enter name of contact to delete");
		String name = sc.nextLine();
		for (int i = 0; i < contact.size(); i++) {
			if (contact.get(i).getFirstName().equals(name)) {
				contact.remove(i);
			}
		}
	}

	public boolean searchForDuplication(ArrayList<ContactStore> contactStores, ContactStore contact) {
		boolean check = false;
		for (ContactStore contactStore : contactStores) {
			if (contact.getFirstName().equalsIgnoreCase(contactStore.getFirstName()))
				check = true;
		}
		return check;
	}

	public static void search(Hashtable<Integer, ArrayList<ContactStore>> dictionary) {
		System.out.println("Enter State Name");
		Scanner sc = new Scanner(System.in);
		String state = sc.nextLine();
		System.out.println("Enter City Name");
		String city = sc.nextLine();
		long count1 = 0;
		long count2 = 0;
		System.out.println("Persons with State name: " + state);
		for (int i = 1; i <= dictionary.size(); i++) {
			List<ContactStore> personWithState = dictionary.get(i).stream()
					.filter(s -> s.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
			System.out.println(personWithState);
			long count= dictionary.get(i).stream().filter(s -> s.getState().equalsIgnoreCase(state)).count();
			count1 = count1 + count;
		}
		System.out.println(count1);
		System.out.println("Num of Persons in State: " + state + " are: " + count1);
		System.out.println("Persons with City name: " + city);
		for (int i = 1; i <= dictionary.size(); i++) {
			List<ContactStore> personWithCity = dictionary.get(i).stream()
					.filter(c -> c.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
			System.out.println(personWithCity);
			long count= dictionary.get(i).stream().filter(c -> c.getCity().equalsIgnoreCase(city)).count();
			count2 = count2 + count;
		}
		System.out.println("Num of Persons in City: " + city + " are: " + count2);
	}
	
	public static void sortByFirstName(Hashtable<Integer, ArrayList<ContactStore>> dictionary) {
		for(int i=1; i<=dictionary.size(); i++) {
			List<ContactStore> list = dictionary.get(i).stream().sorted(Comparator.comparing(AddressBook::getFirstName)).collect(Collectors.toList());
			System.out.println(list);
		}
	}
	
	public static void sortByCity(Hashtable<Integer, ArrayList<ContactStore>> dictionary) {
		for(int i=1; i<=dictionary.size(); i++) {
			List<ContactStore> list = dictionary.get(i).stream().sorted(Comparator.comparing(AddressBook::getCity)).collect(Collectors.toList());
			System.out.println(list);
		}
	}
	
	public static void sortByState(Hashtable<Integer, ArrayList<ContactStore>> dictionary) {
		for(int i=1; i<=dictionary.size(); i++) {
			List<ContactStore> list = dictionary.get(i).stream().sorted(Comparator.comparing(AddressBook::getState)).collect(Collectors.toList());
			System.out.println(list);
		}
	}
}
