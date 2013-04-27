package cm.ctrl;

import java.util.Collections;
import java.util.LinkedList;

import cm.data.Contact;
import cm.gui.AddressForm;

public class ContactManagerMain {

	public static void main(String[] args) {
		AddressForm aForm = new AddressForm();
		aForm.setVisible(true);
		
		LinkedList<Contact> contactList = new LinkedList<Contact>();
		
		testContactList(contactList);
		
		
	}

	private static void testContactList(LinkedList<Contact> contactList) {
		Contact c1 = new Contact();
		c1.setName("Homer Simpson");
		c1.setAddress("742 Evergreen Terrace\nSpringfield");
		c1.setPhone("555-6832");
		c1.setEmail("chunkylover53@aol.com");
		contactList.add(c1);
		
		Contact c2 = new Contact();
		c2.setName("Marge Simpson");
		c2.setAddress("742 Evergreen Terrace\nSpringfield");
		c2.setPhone("555-6832");
		contactList.add(c2);
		
		
		Contact c3 = new Contact();
		c3.setName("Lisa Simpson");
		c3.setAddress("742 Evergreen Terrace\nSpringfield");
		c3.setPhone("555-6832");
		c3.setEmail("smartgirl63_\\@yahoo.com");
		contactList.add(c3);
		
		Contact c4 = new Contact();
		c4.setName("Bart Simpson");
		c4.setAddress("742 Evergreen Terrace\nSpringfield");
		c4.setPhone("555-6832");
		contactList.add(c4);
		
		Contact c5 = new Contact();
		c5.setName("Maggie Simpson");
		c5.setAddress("742 Evergreen Terrace\nSpringfield");
		c5.setPhone("555-6832");
		contactList.add(c5);
		
		Collections.sort(contactList);
	}

}
