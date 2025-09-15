class Person{
    private String name ;
    private int Age;
    public Person(){
        name = "";
        Age = 0;
    }
    public Person(String name,int Age){
        this.name = name;
        this.Age = Age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.Age = other.Age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }
    public void displayPerson(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+Age);
        System.out.println();
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Ram",45);
        Person p3 = new Person(p1);
        Person p4 = new Person(p2);
        p1.displayPerson();
        p2.displayPerson();
        p3.displayPerson();
        p4.displayPerson();
    }
}