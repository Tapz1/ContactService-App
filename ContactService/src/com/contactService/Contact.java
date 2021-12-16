package com.contactService;

public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address){
        /*
         * This is the input validation
         */
        if(contactId == null || contactId.length() > 10){
            throw new IllegalArgumentException("Invalid ID!");
        }
        if(firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("Invalid first name!");
        }
        if(lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("Invalid last name!");
        }
        if(phone == null || phone.length() > 10){
            throw new IllegalArgumentException("Invalid phone number!");
        }
        if(address == null || address.length() > 30){
            throw new IllegalArgumentException("Invalid address!");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;

    }


    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

