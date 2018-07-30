public class Person {

    public static void main(String[] args) {

        Person p = new Person("Tylor");

        p.setName("Tylor");
        System.out.println("Your name is " + p.getName());
        p.sayHello();

//        EXERCISE 2
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }


    private String name;

    public Person(String name) {

        this.name = name;

    }

//    returns the person's name
    public void setName(String name) {

        this.name = name;

    }

//    changes the name property to the passed value
    public String getName() {

        return name;

    }

//    prints a message to the console using the person's name
    public void sayHello() {

        System.out.println("Hello, " + name + "!");

    }

}