import java.awt.font.TextHitInfo;

class Manager {
    //Inheritance kemampuan untuk menurunkan sebuah class ke class lain//
     //Class child hanya bisa punya satu Class parents, dan Class parents bisa punya banyak Class Child//

   String name;

   void sayHello(String name){
       System.out.println("Hello " + name + " My name is " + this.name);
   }

}
class VicePresident extends Manager{//Ini class turunan dari class Manager//
    //Method Overriding//
    //Kemampuan deklarasi ulang method di class child yg sudah ada di class parent//
    //Saat melakukan overriding ketika kita membuat object dari class child, method class parent tidak bisa di akses lagi//
    void sayHello(String name) {
        System.out.println("Hello " + name + " My name is VP " + this.name);

    }

}

