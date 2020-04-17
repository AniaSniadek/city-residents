public class Person {

    public String city;
    public String name;
    public String surname;
    public String pesel;

//    public void writePerson(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the city: ");
//        //city = getCity();
//        this.city = scanner.nextLine();
//    }


    public Person(String city, String name, String surname, String pesel) {
        this.city = city;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public boolean checkPesel() {

        if(getPesel().length() != 11)
            return false;

        int sum = (9 * ((getPesel().charAt(0) - '0') + (getPesel().charAt(4) - '0') +
                (getPesel().charAt(8)) - '0')) + (7 * ((getPesel().charAt(1) - '0') +
                (getPesel().charAt(5) - '0') + (getPesel().charAt(9) - '0'))) +
                (3 * ((getPesel().charAt(2) - '0') + (getPesel().charAt(6) - '0'))) +
                (getPesel().charAt(3) - '0') + (getPesel().charAt(7) - '0');
        System.out.println(sum);
        int score = sum % 10;

        if(score == (getPesel().charAt(10) - '0'))
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
}
