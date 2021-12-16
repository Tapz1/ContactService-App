package com.contactService;


import java.util.*;

public class ContactService {
    private HashMap<String, List<String>> contactMap = new HashMap<>();


    public ContactService(){
        // empty constructor
    }

    public HashMap<String, List<String>> getContactMap() {
        return contactMap;
    }

    public void addContact(String contactId, String firstName, String lastName, String phone, String address){
        // checks to see if contactID is unique
        if(!contactMap.containsKey(contactId)) {
            Contact contact = new Contact(
                    // checks if contact info is compliant (input validation)
                    contactId,
                    firstName,
                    lastName,
                    phone,
                    address
            );

            // adding contact info to HashMap "database"
            List<String> valueSet = Arrays.asList(
                    contact.getFirstName(),
                    contact.getLastName(),
                    contact.getPhone(),
                    contact.getAddress()
            );
            contactMap.put(contactId, valueSet);

        }else{
            System.out.println("That contact ID is already in use!");
        }
    }

    public void deleteContact(String contactId){
        getContactMap().remove(contactId);
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address){
        // this method updates the contact info by contactId

        List<String> valueSet = Arrays.asList(
                firstName,
                lastName,
                phone,
                address
        );
        contactMap.put(contactId,valueSet);
    }

    public void displayAllContacts(){
        for(Map.Entry<String, List<String>> entry : getContactMap().entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + values);
        }
    }


}
