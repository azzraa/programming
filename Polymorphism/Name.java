
// Supperclass called Person that has a method called personTalks()
class Person {
    public void personTalks() {
      System.out.println("People are talking");
    }
  }
  

// Subclasses of Person could be Student and Teacher. Both of these classes have their own implementation of the personTalks() method:
  class Student extends Person {
    public void personTalks() {
      System.out.println("The student says: I am studying");
    }
  }
  
  class Teacher extends Person {
    public void personTalks() {
      System.out.println("The teacher says: I am teaching");
    }
  }
  
  class Name {
    public static void main(String[] args) {
      Person myPerson = new Person();  // Create a Person object
      Person myStudent = new Student();  // Create a Student object
      Person myTeacher = new Teacher();  // Create a Teacher object
      myPerson.personTalks();
      myStudent.personTalks();
      myTeacher.personTalks();
    }
  }