import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }


    public boolean addNewContact(Contact contact){

        if (findContact(contact)!=-1){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact contactToUpdate, Contact newContact){
        if (myContacts.contains(contactToUpdate)){
            myContacts.set(myContacts.indexOf(contactToUpdate),newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }



    private int findContact(Contact contact){
        return findContact(contact.getName());
    }
    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for (int i =0; i< myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName()==name){
                return contact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i =0; i< myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

}
