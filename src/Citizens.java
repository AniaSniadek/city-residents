import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Citizens {

    static Vector<Person> peopleList = new Vector<Person>();

    public void addPerson(Person person){

        for(Person p : peopleList){
            if(p.getPesel().equals(person.getPesel())){
                System.out.println("Uzytkownik o podanym peselu juz istnieje");
                return;
            }
            peopleList.add(person);
        }
    }

    public void sortList() {
        Collections.sort(peopleList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }

    public void showList() {
        sortList();
        System.out.println("List of citizens in the system:");
        for(Person p: peopleList){
            System.out.println(p.getDetailsAsString());
        }
    }


}
