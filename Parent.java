class Parent {
    //Variable Hiding//
    //Merupakan suatu masalah ketika membuat variable yg sama di class child dengan parent//
    //Yaitu menutupi variable yg ada di class parent nya//
    //Ktika kita membuat ulang variable di class, itu berarti variable hiding//

    String name;
    void doIt(){
        System.out.println("Do it from Parent");
    }
}

class Child extends Parent{
    String name;//Sebenarnya tidak di sarankan membuat nama variable yg sama di turunan//
    void doIt(){
        System.out.println("Do it from child");
    }
}
