public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person1 = new Person("Pluto","plutyorr@email.com");
        Person person2 = new Person("Teebag","housemon@gmail.com");
        Person person3 = new Person("Josh","joshjoshhtatseme@gmail.com");


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        Addressbook husseinbook = new Addressbook();
        husseinbook.addingContact(person1);
        System.out.println(husseinbook);

        Addressbook meeebook = new Addressbook();
        meeebook.addingContact(person2);
        System.out.println(meeebook);

        Addressbook joshguys = new Addressbook();
        joshguys.addingContact(person3);
        System.out.println(joshguys);






    }
}