class Employee {
    //Polymorphism adlh kemampuan sebuah object berubah bentuk menjadi bentuk lain//
    String name;

    Employee(String name){

        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " My name is Employee " + this.name);
    }
}

class Employee2 extends Employee{
    Employee2(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " My name is Employee 2 " + this.name);
    }
}

class Employee3 extends Employee2{
    Employee3(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " My name is Employee 3 " + this.name);
    }
}
