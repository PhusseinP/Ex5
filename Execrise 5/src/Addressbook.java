import java.util.ArrayList;

public class Addressbook {
   ArrayList<Person> mybook = new ArrayList<>();

   public void addingContact(Person a){
       mybook.add(a);
   }

    @Override
    public String toString() {
        return "Addressbook{" +
                "mybook=" + mybook +
                '}';
    }
}
