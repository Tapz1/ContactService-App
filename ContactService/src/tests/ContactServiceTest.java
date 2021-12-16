package tests;

import com.contactService.ContactService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    ContactService contactService = new ContactService();

    @Test
    void addContact() {
        Assertions.assertAll("adding contact", () -> contactService.addContact(
                "6067",
                "Colonel",
                "Sanders",
                "6035554224",
                "226 Wallaby Way"));
    }

    @Test
    void deleteContact() {
        Assertions.assertAll("deleting contact", () -> contactService.deleteContact("6067"));
        assertNull(contactService.getContactMap().get("6067"));
    }

    @Test
    void updateContact() {
        Assertions.assertAll("updating contact", () -> contactService.updateContact(
                "222",
                "Joe",
                "Tapia",
                "6032042281",
                "100 City Rd"));
    }

    @Test
    void viewContacts(){
        for(Map.Entry<String, List<String>> entry : contactService.getContactMap().entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + values);
        }
    }

}