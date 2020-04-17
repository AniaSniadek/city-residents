import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Citizens citizens = new Citizens();
        int ilosc;
        System.out.println("Wpisz ile osob dodac: ");
        ilosc = scanner.nextInt();

        for(int i=0; i < ilosc; i++){
            Person person = new Person();
            person.writePerson();
            if(person.checkPesel()){
                citizens.addPerson(person);
            } else {
                System.out.println("Error");
            }
        }
    }
}
