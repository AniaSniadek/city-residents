import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

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
                    System.out.println(ANSI_RED + "Incorrect pesel number! Try again!" + ANSI_RESET);
                    i--;
                }
            }

            citizens.showList();

        } else {
            System.out.println(ANSI_RED + "Invalid input!" + ANSI_RESET);
            System.exit(0);
        }


    }
}
