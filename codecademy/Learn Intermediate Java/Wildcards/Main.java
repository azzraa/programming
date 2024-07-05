class SchoolPerson {
    private String name;

    public SchoolPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Bus<T> {
    private T rider;

    public Bus(T rider) {
        this.rider = rider;
    }

    public void printRider() {
        if (rider instanceof SchoolPerson) {
            System.out.println("Rider name: " + ((SchoolPerson) rider).getName());
        } else {
            System.out.println("Unknown rider");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SchoolPerson person = new SchoolPerson("Peter");
        Bus<SchoolPerson> busWPerson = new Bus<>(person);
        busWPerson.printRider();
    }
}
