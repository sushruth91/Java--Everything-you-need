package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<Contacts>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contacts contact){
        if(findContact(contact)>=0){
            System.out.println("Contact already exits");
            return false;

        }
        myContacts.add(contact);
        return true;

    }
    private int findContact(String contactName){

       for(int i=0;i<myContacts.size();i++){
           Contacts contact =  this.myContacts.get(i);
           if(contact.getName().equals(contactName)){
               return i;
           }

       }
       return -1;

    }

    public boolean updateContact(Contacts  oldContact, Contacts newContact){

            int listindex = findContact(oldContact);

            if(listindex<0){
                System.out.println(oldContact.getName()+ " not found!");
                return false;
            }
            this.myContacts.set(listindex,newContact);
        System.out.println(oldContact.getName()+" was updated by "+newContact.getName());
        return true;
    }

    private int findContact(Contacts contact){
           return (this.myContacts.indexOf(contact));


    }

    public String queryContact(Contacts contactName){
        if(findContact(contactName)>=0){
            return contactName.getName();
        }
        return null;
    }

    public boolean removeContact(Contacts contact){
        int listindex = findContact(contact);
        if(listindex<0){
            System.out.println(contact.getName()+ " not found!");
            return false;
        }
        this.myContacts.remove(listindex);
        System.out.println(contact.getName()+" was deleted! ");
        return true;

    }
    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0;i<this.myContacts.size();i++)
        {
            System.out.println(i+1+"."+ myContacts.get(i).getName()+"--> "+
                    myContacts.get(i).getPhoneNumber());


        }
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if (position<0){
            return null;
        }
        return myContacts.get(position);
    }


}
