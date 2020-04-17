import java.util.Scanner;

public class Main {

    public static final Person person = new Person();

    public static void main(String[] args){
        writePerson();
        System.out.println(person.getCity());
        System.out.println(person.getName());
    }

    public static void writePerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city: ");
        String city = scanner.nextLine();
        person.setCity(city);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        person.setName(name);
    }

}
