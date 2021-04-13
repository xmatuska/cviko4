package sk.stuba.fei.uim.oop;

public class Main {

    public static void main(String[] args){
        Contact contact = new Contact("Matusko","Matuska");
        var contact2 = new Contact("Igorko", "Najselko");
        var contact3 = new Contact("Lukas Novak");

        var contact4 = Contact.parseFromFullName("Gabriel Juhas");

        var contacts1 = new Contact[] {contact2, contact3, contact4};
        contact.setFriendsFromArray(contacts1);

        contacts1[0].setFirstName("Mato");

        contact.setFriends(contact4,contact2,contact3);

        contact3.setFirstName("zahorak");

    }


}
