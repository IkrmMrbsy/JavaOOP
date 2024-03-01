class SuperConstruct {
    //Kata kunci Super itu bisa untuk mengakses field,method dan Constructor//
    //Untuk mengakses parent constructor, kita harus mengakses nya di child nya//
    //Jika di class parent ada parameter nya, class child wajib mengakses parent construct trsbut//
    String name;

    SuperConstruct(String name){//Tetapi jika parent constructor tdk ada parameter//
        //Child constructor tidak wajib membuat constructor//
        this.name = name;
        //Jika constructor parent mempunyai 2 parameter//
        //child constructpr bebas memanggil yang mana saja, asalkan harus manggil constructor parent nya//
    }

    void sayHello(String name){

        System.out.println("Hello " + name + " My name is " + this.name);
    }
}

class SuperConstruct2 extends SuperConstruct{
    SuperConstruct2(String name){

        super(name);
    }

    void sayHello(String name){

        System.out.println("Hello " + name + " My name is " + this.name);
    }

}


