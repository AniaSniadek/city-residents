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

    public void showList() {
        System.out.println("List of citizens in the system:");
        for(Person p: peopleList){
            System.out.println(p.getDetailsAsString());
        }
    }
}
