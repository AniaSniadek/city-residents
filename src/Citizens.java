import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Citizens {

    static Vector<Person> peopleList = new Vector<Person>();

    public void addPerson(Person person){
//
        for(Person p : peopleList){
            if(p.getPesel().equals(person.getPesel())){
                System.out.println(Colors.ANSI_RED + "User with this number of pesel already exists!" + Colors.ANSI_RESET);
            }
        }
        peopleList.add(person);
    }

    public void sortList() {
        Collections.sort(peopleList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSurname().compareTo(p2.getSurname());
            }
        });
    }

    public void showList() {
        sortList();
        System.out.println(Colors.ANSI_CYAN + "List of citizens in the system:" + Colors.ANSI_RESET);
        for(Person p: peopleList){
            System.out.println(p.getDetailsAsString());
        }
    }


}
