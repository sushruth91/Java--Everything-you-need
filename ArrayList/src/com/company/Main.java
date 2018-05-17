package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static MobilePhone mobilePhone = new MobilePhone("4088194761");
    public static void main(String[] args) {

        boolean quit = false;
        System.out.println("Starting Phone...");
        availableOptions();
        while(!quit){
            System.out.println("Enter action (6: to see the list of available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case (0):
                    System.out.println("Shutting down....");
                    quit = true;
                    break;
                case(1):

                    mobilePhone.printContacts();
                    break;
                case(2):
                    addNewContact();
                    break;

                case(3):
                    updateContact();
                    break;

                case(4):
                    removeContact();
                    break;

                case(5):
                    queryContacts();
                    break;

                case(6):
                    availableOptions();
                    break;


            }

        }




    }

    public static void removeContact(){
        System.out.println("Enter a contact to be removed:");
        String name= scanner.nextLine();
        Contacts existingContactRecord  = mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;

        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact successfully deleted.");
        }
        else{
            System.out.println("Cannot delete contact.");
        }

        }

        public static void queryContacts(){
            System.out.println("Enter a name to search");
            String name = scanner.nextLine();
            Contacts existingContactRecord  = mobilePhone.queryContact(name);
            if(existingContactRecord==null){
                System.out.println("Contact not found");
                return;

            }

            System.out.println("Name: "+ existingContactRecord.getName()+"\nPhone Number: "+
                    existingContactRecord.getPhoneNumber());




        }
    public static void updateContact(){
        System.out.println("Enter a contact to be updated:");
        String oldName = scanner.nextLine();
        Contacts existingContactRecord  = mobilePhone.queryContact(oldName);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;

        }
        System.out.println("Enter a new Contact to be updated:");
        String newContact = scanner.nextLine();
        System.out.println("Enter a new number");
        String number  = scanner.nextLine();

        Contacts newContacts = new Contacts(newContact,number);
        if(mobilePhone.updateContact(existingContactRecord,newContacts)){
            System.out.println("Updated successfully");

        }
        else{
            System.out.println("Error updating record");
        }



        }

    public static void availableOptions(){
        System.out.println("Available options\n Press");
        System.out.println("0 - to shutdown\n"+
                           "1 - to print contacts\n"+
                           "2 - to add new contact\n"+
                           "3 - to update an existing contact\n"+
                           "4 - to remove an existing contact\n"+
                           "5 - query if an existing contact exists\n"+
                           "6 - to print a list of available actions\n");
        System.out.println("Choose your actions");


    }
    public static void addNewContact(){
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        System.out.println("Enter a number:");
        String number = scanner.nextLine();
        Contacts contacts = new Contacts(name,number);
        if(mobilePhone.addNewContact(contacts)){
            System.out.println("Contact "+name+ " added");
        }
            else{
                    System.out.println("Already exists. Cannot add.");
                }

        }



}
