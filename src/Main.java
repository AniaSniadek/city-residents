import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args){


        Citizens citizens = new Citizens();
        int ilosc;
        System.out.println("Enter how many people you want to add to the system: ");

        if(scanner.hasNextInt()){
            ilosc = scanner.nextInt();
            for(int i=0; i < ilosc; i++){
                Person person = new Person();
                person.writePerson();
                if(person.checkPesel()){
                    citizens.addPerson(person);
                } else {
                    System.out.println(ANSI_RED + "Error! Incorrect pesel number!" + ANSI_RESET);
                }
            }
        } else {
            System.out.println(ANSI_RED + "Invalid input!" + ANSI_RESET);
            System.exit(0);
        }


    }
}
