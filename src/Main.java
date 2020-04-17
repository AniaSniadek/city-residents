import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        Citizens citizens = new Citizens();
        System.out.println("Enter how many people you want to add to the system: ");

        if(scanner.hasNextInt()){
            int amount = scanner.nextInt();
            for(int i=0; i < amount; i++){
                Person person = new Person();
                person.writePerson();
                if(person.checkPesel()){
                    citizens.addPerson(person);
                } else {
                    System.out.println(Colors.ANSI_RED + "Incorrect pesel number! Try again!" + Colors.ANSI_RESET);
                    i--;
                }
                System.out.println(Colors.ANSI_GREEN + "------------------------------------------" + Colors.ANSI_RESET);
            }

            citizens.showList();

        } else {
            System.out.println(Colors.ANSI_RED + "Invalid input!" + Colors.ANSI_RESET);
            System.exit(0);
        }


    }
}
