public class Person {

    public static void main(String[] args) {

        Person p = new Person("Tylor");

        p.setName("Tylor");
        System.out.println("Your name is " + p.getName());
        p.sayHello();

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