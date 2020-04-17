import java.util.Scanner;

public class Person {

    public String city;
    public String name;
    public String surname;
    public String pesel;

    public void writePerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.setName(scanner.nextLine());
        System.out.println("Enter surname: ");
        this.setSurname(scanner.nextLine());
        System.out.println("Enter the city: ");
        this.setCity(scanner.nextLine());
        System.out.println("Enter pesel: ");
        this.setPesel(scanner.nextLine());
    }

    public boolean checkPesel() {
        if(this.getPesel().length() != 11)
            return false;

        int sum = (9 * ((this.getPesel().charAt(0) - '0') + (this.getPesel().charAt(4) - '0') +
                (this.getPesel().charAt(8)) - '0')) + (7 * ((this.getPesel().charAt(1) - '0') +
                (this.getPesel().charAt(5) - '0') + (this.getPesel().charAt(9) - '0'))) +
                (3 * ((this.getPesel().charAt(2) - '0') + (this.getPesel().charAt(6) - '0'))) +
                (this.getPesel().charAt(3) - '0') + (this.getPesel().charAt(7) - '0');
        int score = sum % 10;

        if(score == (this.getPesel().charAt(10) - '0'))
            return true;

        return false;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDetailsAsString(){
        String text = this.getSurname() + " " + this.getName() + " | " +
                    this.getCity() + " | " + this.getPesel();
        return text;
    }
}
