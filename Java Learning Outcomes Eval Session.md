# Welcome to the Learning Outcomes Evaluation

Dear students,

Welcome to this Learning Outcomes Evaluation session. Over the next two hours, we will be assessing your understanding and mastery of the learning outcomes for this semester. This evaluation is an important opportunity for you to showcase your knowledge and skills.

Please take this evaluation seriously and demonstrate your best work from the last two weeks by using your personal git account as proof. Remember to answer each question thoroughly and provide clear explanations where necessary.

Best regards,
Ghada Hassan and Kay Berkling

## Ethics Section regarding generative and other forms of AI

The student acknowledges and agrees that the use of AI is strictly prohibited during this evaluation. By submitting this report, the student affirms that they have completed the assessment independently and without the assistance of any AI technologies. This agreement serves to ensure the integrity and authenticity of the student's work, as well as their understanding of the learning outcomes.


## Checklist before handing in your work

- [ ] Review the assignment requirements to ensure you have completed all the necessary tasks.
- [ ] Pay careful attention to the requested links that must come from your project.
- [ ] Double-check your links and make sure that links lead to where you intended. Each answer should have links to work done by you in your own git repository
- [ ] Make sure you have at least 10 references to your project code (This is important evidence to prove that your project is substantial enough to support the learning outcome of object oriented design and coding within a larger piece of code.)
- [ ] Include comments to explain your referenced code and why it supports the learning outcome
- [ ] Proofread any accompanying documentation or comments for grammar and clarity.
- [ ] Commit and push this markup file to your personal git repository and hand in the link and a hard-copy via email at the end of the exam.

Remember, this checklist is not exhaustive, but it should help you ensure that your work is complete, well-structured, and meets the required standards.

Good luck with your evaluation!


## Learning Outcomes

| Exam Question | Total Achievable Points | Points Reached During Grading |
|---------------|------------------------|-------------------------------|
| Algorithms    |           4            |                               |
| Data types    |           4            |                               |
| Complex Data Structures |  4            |                               |
| Concepts of OOP |          6            |                               |
| OO Design     |           6            |                               |
| Class concepts |            8           |                               |
| Testing       |           6            |                               |
| Operator/Method Overloading | 6 |                               |
| Templates/Generics |       6            |                               |
| Class libraries |          6            |                               |
| Multi-threading |          6            |                               |
| Lambda expressions |       6            |                               |
| Serialization |            6           |                               |
| Database connectivity |   6            |                               |
| Total        |           80          |                               |



## Evaluation Questions

Please answer the following questions to the best of your ability to show your understanding of the learning outcomes. Please provide examples from your project code to support your answers. Only links to your own git will count. When you explain what you did make sure to explain why you did it this way with clear reasoning relating to your own work and not generic statements that anyone could make. 


## Evaluation Material
https://github.com/azzraa/programming/tree/main

### Algorithms

Algorithms are manyfold and Java can be used to program these. Examples are sorting or search strategies but also mathematical calculations. Please refer to **two** areas in either your regular coding practice or within your project, where you have coded an algorithm. Do not make reference to code written for other classes, like theoretical informatics.

Insertion Sort:
https://github.com/azzraa/programming/blob/main/Algorithms/Searching%20and%20Sorting/InsertionSort.java

I created an Insertion Sort by first importing an Arrays package, so I would be able to have access to Arrays. Starting the code, I created a class calles InsertionSort to be able to create in there a method, where I would be able to go through the array length in a for loop. Then it should iterate in a while loopn through the arrays by starting with the second element because i = 1. The element is stored and then compared to the elements before. For the main method I wanted to give some array numbers to print them out and sort them with the sort(numbers) method.
Insertion Sort helps us placing an element in the correct order by looking at the elements before that.

Selection Sort:
https://github.com/azzraa/programming/blob/main/Algorithms/Searching%20and%20Sorting/SelectionSort.java

For the selection sort I again imported the Arrays package for accessibility. I created a class SelectionSort and in there I have a selectionSort methid to iterate through each interation to find the smallest element from the array numbers. When finding the smallest number, it swaps elements in indexOne and indexTwo in the array.
Selection Sort helps us to have the right order by swapping the elements starting from the smallest one.



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |


### Data types

Please explain the concept of data types and provide examples of different data types in Java.
Typical data types in java are int, double, float, char, boolean, long, short, byte, String, and arrays. Please provide one example for each of the **three** following data types in your code. One of these links must be to your project.

Data Types help us define what kind of form of data we want to implement in our specified variable.
We use int for whole numbers, double for decimal numbers, char for only characters, Arrays for a collection of elements and boolean for true or false questions.

* Array
https://github.com/azzraa/programming/blob/main/codecademy/Arrays/Main.java
I created a Main class and have a main method, where i collect an array with String calles students. Here I collect a few student names and then print out the length of the array colelction, which would be 4.


* boolean
https://github.com/azzraa/programming/blob/main/Data%20Types/Mess.java
In this code I tried different data types at once. I used boolean to show me wheather "isPG" true or false, which in my case was true, so we have to define the data type (boolean) and give it a name (isPG) and then define what the outcome would be, so it is either true or false (true). Before that I created a class calles Mess and created a Main Method. Below the boolean isPG, I created a challenge about water Intake. I wanted to check if the challenge is complete by having yourWaterIntake >= totalRecommendedAmount. I did that with a boolean, so if yourWaterIntake is bigger or equals totalRecommendedAmout, then it is true and we completed the challenge.

Regarding the link to your project, explain the context in which you have used this data type being specific to your project. 

* Strings
Project: https://github.com/azzraa/programming/blob/main/Project/FlutteringFlora/FlutteringFlora.java
In my Project I used Strings to display the name of the buttons by initializing them, so restartButton = new JButton("Restart"). I gave it the String data type with my "". I also used it to display my score, my highscore and game over.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           1            |                               |
|           1           |                               |
|           2 (project link)          |                               |



### Complex Data Structures

Examples of complex data structures in Java are ArrayList, HashMap, HashSet, LinkedList, and TreeMap. Please provide an example of how you have used **two** of these complex data structures in your code and explain why you have chosen these data structures. Examples do not have to come from the project.

Array List:
https://github.com/azzraa/programming/blob/main/Complex%20Datastructures/ToDos.java
I created an ArrayList to manage a todo lists. I created a new class calles ToDos. Under that I have a main Method, where I implementes an ArrayList calles toDoList and added 3 items to them, so "Water plants", "Drink" and "Eat" and then I printed the list. Under that I also implemented two other ArrayLists by creating an ArrayList with Strings and then adding elements with the add() method and printed them out.
ArrayLists helps us to create Lists with multiple elements to deal with, so it is especially good in my cose for to do lists.


Hash Maps: 
https://github.com/azzraa/programming/blob/main/codecademy/Dynamic%20Programming/fibMemo.java

For the Hash Map, I first imported the necessary libraries, so HashMap and Map. Then I created a class calles fibMemo. Here I have a main method, where I create new Hash Map with Integers and print this out. Then I created a new object in the Hash Map with     map = new HashMap<Integer, Integer>(); and printed that out as well. I created another method for fibMemo to return the int n. 
Hash Maps are especially good for memorization, it is used for examples like my code above with Fibonacci Numbers.



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |



### Concepts of OOP
Concepts of OOP are the basic building blocks of object-oriented programming, such as classes, objects, methods, and attributes. 
Explain HOW and WHY your **project** demonstrates the use of OOP by using all of the following concepts:
Link to the code in your project that demonstrates what you have explained above.

https://github.com/azzraa/programming/blob/main/Project/FlutteringFlora/FlutteringFlora.java

* Classes/Objects
In my project I used classes for encapsulation for bird, the opponent bird and the pipes and for the general logic of the game. With the encapsulation I can have access to the variables from other classes, which helps me really use the different classes in my game to connect them together and having access to them. While the game logic is for example private and the other classes have no access to it.

* Methods
I also used methods like draw, game methods and restartGame method for encapsulation, so I can use the same methods for bird and the opponentbird.

* Attributes 
In my game I used attributes for the game windows, the images and also the birds and buttons. For window I used int for the size of the game window. I used int for the hight and width of the birds. This allowed me to really define, what kind of attribute i wanted to use to make it accessible and specific as possible.


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|          2              |                               |
|          2              |                               |
|          2              |                               |



### OO Design
Please showcase **two** areas **where** you have used object orientation in your project. (How and why you use it will be the next question below.)
Examples in Java of good oo design are composition, encapsulation, inheritance, polymorphism, and abstraction. 

In my game I used inheritance with JPanel, which allows FlutteringFlora to encapsulate the game's functionality. The Bird and the Pipe classes are also using inheritance of FlutteringFlora because it makes it easier to manage the interactions with the collision between birds and pipes and also the opponent bird. With inheritance it gives our game a better logic, making it easier to organize, especially between classes and methods.

As I already said I used a lot of encapsulation in my game by having different private variables and public methods to really controll the bird, the pipes and the opponent bird. The Fluttering Flora class is public but the variables in there, so boardWidth and Height are encapsulated, so private and not accessible by other classes.


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|              3         |                               |
|              3         |                               |



### Advanced Class Concepts
Advanced class concepts include constructors, abstract classes, interfaces, access modifiers, static methods, and variables. Please provide an example of how you have used **two** of these class concepts in your **project** code and explain why you have chosen these class concepts and how they work within your code.

In my game I used the FlutteringFlora class as a constrcutor to have the base of the game. Also the bird class is a constructor, where I initialized the image of the bird and the posititon as well as in the opponentBird Cobnstructor. My Pipe constrcutor also helps the position of the pipes and initializes the image of them. I chose those as constrcutors because it sets up the lgoic of the game with all the images, sounds, my buttons and also all the placements of the pipes and the postions of the birds.

With the ActionListener Interface my FlutterinfFlora class implemenets, I can use my actionPerformed method, where i can handle all the movemenets and collisions in the game,
With my KeyListener Interface also in my flutteringFlora class I am able to use my space key for the bird to be able to jump, so I use keyPresses, keyTped and keyReleased to be able to use my keyboard for the game.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|            4           |                               |
|            4           |                               |

### Testing
Java code is tested by using JUnit. Please explain how you have used JUnit in your project and provide a link to the code where you have used JUnit. Links do not have to refer to your project and can refer to your practice code. If you tested without JUnit, please explain how you tested your code.
Be detailed about what you are testing and how you argue for your test cases. 
Test cases usually cover the following areas:
* boundary cases
* normal cases
* error cases / catching exceptions 


If we have a class Student and values for name and id, We have to make sure Student is storing all these values, so with JUnit Testing we can check if they are proberly stored in the Student class.
They are different methods for testing like Before, Test, After and Ignore that we can import in our code.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Operator/Method Overloading
An example of operator overloading is the "+" operator that can be used to add two numbers or concatenate two strings. An example of method overloading is having two methods with the same name but different parameters. Please provide an example of how you have used operator or method overloading in your code and explain why you have chosen this method of coding.
The link does not have to be to your project and can be to your practice code.

https://github.com/azzraa/programming/blob/main/Operator%20and%20Method%20Overload/BirthdayPerson.java

I created a class BirthdayPerson with different attributes like age, wisdom and fitness. We define different methods for these attributes so setAge(), setWisdom() and setFitness() to be able to overload these methods. In our hasBirthday() method we can bring all these methods together. we are assiging the values to the variables by this.age = inoutAge and we have arithmetic operations to adjust the attributes altogether by this,age +1 or this.wisdom +5 during the birthday. In the main method we know want to use all these attributes together, so we create an object, which will be a person called emiliy and we want to see her age, her wisdom and fitness and we print these out by putting the object name in front and after that the attribute that we want to print out.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



### Generics
Generics in java are used to create classes, interfaces, and methods that operate on objects of specified types. Please provide an example of how you have used generics in your code and explain why you have chosen to use generics. The link does not have to be to your project and can be to your practice code.

https://github.com/azzraa/programming/tree/main/Templates%20and%20Generics/Generics/Classes

In our Container class we use the type parameter <T> to store any type of data. I can now use a String object in Container<String> data type and a Container<Book> data type because I did not sepcify the data type and I allowed to be able to give in any data type. I encapsualted the data to controll the access to the specified data without specifing the data type by putting the T. T shows us that we don't need any specific data type and we are able to use any data types in our class, where we implemented the Container.



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Class Libraries
Examples of class libraries in java are the Java Standard Library, JavaFX, Apache Commons, JUnit, Log4j, Jackson, Guava, Joda-Time, Hibernate, Spring, Maven, and many more. Please provide an example of how you have used a class library in your **project** code and explain why you have chosen to use this class library. 

https://github.com/azzraa/programming/blob/main/Project/FlutteringFlora/FlutteringFlora.java

In my game I wanted to add a sound to my game, so when I presses a key I wanted to be able to hear a sound and for that it was not only enough to add a sound resource in the code, I also had to import the Audio packages, so I used 3 different libraries to be able to hear and play sound: import javax.sound.sampled.AudioInputStream; import javax.sound.sampled.AudioSystem; import javax.sound.sampled.Clip; With these libraries I was able to load the sound and play the sound in my game.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6           |                               |

### Multi-threading
multi-threading is the ability of a CPU to execute multiple processes or threads concurrently. Please explain the concept of multi-threading and provide an example of how you have used multi-threading in your code. The link does not have to be to your project and can be to your practice code.

https://github.com/azzraa/programming/tree/main/Multithreading
In Multithreading we can run multiple threads at once, so we have a file calles MultithreadThing, where we have a Runnable interface and a run method. We implemented a threadNumber to specify the thread instance. And then it prints out the numbers 1 to 5 with the threadNumber in the run method that we started.
In our file Multithreading we have a main methods, where we use a for loop to iterate through the instances of our MultiplethreadThing. For all the 5 iterations, there will be 5 unique Numbers for all the Threads. We can start each thread using the run method from MultithreadThing.
We use aus Runnable interface to define task that can be executed by a thread and with our Multithreading  we create and starts the threads.


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Lambda Expressions
An example of a lambda expression is the following code: 
```java
List<String> list = new ArrayList<>();
list.forEach((String s) -> System.out.println(s));
```
Please explain the concept of lambda expressions and provide an example of how you have used lambda expressions in your code. The link does not have to be to your project and can be to your practice code.

https://github.com/azzraa/programming/tree/main/Lambda

I have a Printable file code, which is an interface and it has only one method print(String suffix). We need this only one method to make it work for our Lambda expression. 
We have another file of code in Cat, where Cat implements the interface in Printable to get access to the print method above.
In our main method of the Lambdas class, we create a lambda expression (s) -> "Meow " + s to create an instance of the Printable and adds Meow the toe suffix(s).
With lambda expressions we can implement interfaces with a single abstract method, so in our Cat example, the lambda expression (s) -> "Meow " + s  is used privately for our Printable interface for printing. 


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|           6            |                               |


### Serialization

Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Please explain why you would use serialization and provide an example of how you have used serialization in your code. The link does not have to be to your project and can be to your practice code.


https://github.com/azzraa/programming/blob/main/Advanced%20Topics/Serialization/Car.java

Using seralization helps to be saved to a file and send to a network

First we need to import the Seriazable package. In our class Car we can implement the Seriziable. We have our serialVersionUID in the Car class that can react to this class, so we have an unique identifier, and we defined it to 1L because we don't want to break the capability of the seralization. We also have make and year as attributes in the Car. We want to have the compability between the serialized object and the class attributes (make and year).
After that we have the getYear() and getMake() methofs to return the year and make of the Car class.
Then we will print out the Car, the make and the year in our toString() method.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6          |                               |


### Database Connectivity
Web applications use databases to store data. Please explain how you have connected to a database in your project and provide an example of how you have used database connectivity in your code. The link does not have to be to your project and can be to your practice code. Do not use code from other classes, like database programming, Web Engineering, or theoretical informatics.
This topic appeared in your learning agreement as the last point in the table under advanced topics.

First we need to choose a system that we want to work with, so for example MongoDB, we need to install all the necessary packages and after that specify all the details such as password and username.
In our code we need to load the specfic database and connect database with the file.


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



