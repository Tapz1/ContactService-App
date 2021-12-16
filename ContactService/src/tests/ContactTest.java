package tests;

import com.contactService.Contact;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {



    @org.junit.jupiter.api.Test
    void testContactClass() {
        Contact contact = new Contact("1234567891", "Chris",
                "Tapia", "6036214567", "2500 N River Rd");
        assertEquals("1234567891", contact.getContactId());
        assertEquals("Chris", contact.getFirstName());
        assertEquals("Tapia", contact.getLastName());
        assertEquals("6036214567", contact.getPhone());
        assertEquals("2500 N River Rd", contact.getAddress());
    }


    @org.junit.jupiter.api.Test
     void testContactClassTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("1234567891", "Chris Tapia",
                    "Chris Tapia", "999-999-9999", "2500 N River Rd, Manchester, NH");
        });
    }

    @org.junit.jupiter.api.Test
    void testContactClassNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact(null, null,
                    null, null, null);
        });
    }

}