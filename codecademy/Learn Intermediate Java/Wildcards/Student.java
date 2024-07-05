class SchoolPerson {
    private String name;

    public SchoolPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends SchoolPerson {
    private String bestSubject;

    public Student(String name, String bestSubject) {
        super(name);
        this.bestSubject = bestSubject;
    }

    public String getBestSubject() {
        return bestSubject;
    }

    public void setBestSubject(String bestSubject) {
        this.bestSubject = bestSubject;
    }

    @Override
    public String toString() {
        return "Student = (name = " + this.getName() + ", bestSubject = " + this.bestSubject + ")";
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

