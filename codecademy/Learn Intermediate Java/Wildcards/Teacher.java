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

class Teacher extends SchoolPerson {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher = (name = " + this.getName() + ", subject = " + this.subject + ")";
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
            if (rider instanceof Student) {
                System.out.println("Best Subject: " + ((Student) rider).getBestSubject());
            } else if (rider instanceof Teacher) {
                System.out.println("Subject: " + ((Teacher) rider).getSubject());
            }
        } else {
            System.out.println("Unknown rider");
        }
    }
}
