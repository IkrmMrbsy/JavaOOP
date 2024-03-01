public class PersonObject {
    public static void main(String[] args) {
        //Object adlh hasil instansiasi dari class//
        //membuat object kita bisa menggunakan kata kunci (new dan diikuti dengan nama classnya)//
        //Mmembuat object//
        //Jika pakai constructor, wajib memasukan value nya di dalam kurung//
        var person1 = new PersonClass("Ahmad", "Bandung", 59);
        //Untuk mengakses field nya, pakai (.)setelah nama object dan diikuti nama fieldnya//
        person1.name = "Ahmad";
        person1.address = "Jakarta";
        person1.age = 54;

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.age);
        //Mengakses Method menggunakan (.) diikuti dengan nma method nya//
        person1.sayHello("Zehan");

        //jika pakai constructor, wajib memasukan value nya juga//
        //jika pakai constructor, tidak perlu membuat field nya lagi//
        var person2 = new PersonClass("Zehan");//Dengan satu parameter(Constructor 2)//
        person2.sayHello("Ahmad");

        var person3 = new PersonClass();//Dengan Tanpa parameter(Constructor 3)//

        //BAGIAN INHERITANCE//
        var inheritance = new Manager();
        inheritance.name = "Zehan";
        inheritance.sayHello("Ahmad");

        var vp = new VicePresident();
        vp.name = "Rio";
        vp.sayHello("Choki");

        //Super Keyword//
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
        //Super Keyword//

        //Super Constructor//
        var constructor = new SuperConstruct("Rindi");
        constructor.sayHello("Andi");
        var constructor2 = new SuperConstruct2("Andi");
        constructor2.sayHello("Rindi");
        //Super Constructor//
        //BAGIAN INHERITANCE//

        //BAGIAN POLYMORPHISM//
        Employee employee = new Employee("Ikram");//Dari yg tadinya Employee//
        employee.sayHello("Zahir");

        employee = new Employee2("Nazril");//Bisa berubah jadi Employee2//
        employee.sayHello("Rano");//Pedahal tipe variable ny ttp Employee//

        employee = new Employee3("Mansyur");
        employee.sayHello("Wahab");
        //Tetapi kalau pakai Polymorphism, kita tidak bisa akses Method/Field yg ada di class child nya//
        //Method Polymorphism//
        //Walaupun tipe data nya Employee, tetapi kita bisa memasukan turunanya//
        sayHello(new Employee("Eko"));
        sayHello(new Employee2("Joko"));
        sayHello(new Employee3("Rini"));
        //Method Polymorphism//
        //BAGIAN POLYMORPHISM//

        //BAGIAN VARIABLE HIDING//
        Child child = new Child();
        child.name = "Ikram";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();//Ini akan mencetak method yg di child nya, krna object nya (child)//
        System.out.println(parent.name);//name yg di akses yaitu yg di class parentnya//
        //BAGIAN VARIABLE HIDING//
    }

    //BAGIAN POLYMORPHISM//
    //Method Polymorphism//
    //Jika tidak ada Polymorphism, kita harus buat method nya satu2//
    //seperti method untuk Employee1,Employee2,Employee3//
    static void sayHello(Employee employee) {//Cukup buat satu, yg penting class parent//
        //Type check and Casts(Melakukan konversi tipe data)//
        //Sebelum melakukan konversi, pastikan melakukan type check dulu//
        //Dengan menggunakan kata kunci (instanceof)//
        //Hasil operator instanceof adalah boolean//
        //tru jika tipe data sesuai, false jika tipe data tidak sesuai//
        if (employee instanceof Employee3) {
            Employee3 employee3 = (Employee3) employee;
            System.out.println("Hello Employee3 " + employee3.name);
        } else if (employee instanceof Employee2) {
            Employee2 employee2 = (Employee2) employee;
            System.out.println("Hello Employee2 " + employee2.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }

    //Method Polymorphism//
    //BAGIAN POLYMORPHISM//
}
