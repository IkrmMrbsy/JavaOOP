public class PersonObject {
    public static void main(String[] args) {
        //Object adlh hasil instansiasi dari class//
        //membuat object kita bisa menggunakan kata kunci (new dan diikuti dengan nama classnya)//
        //Mmembuat object//
        var person1 = new PersonClass("Ikram", "Jakarta", 20);
        //Untuk mengakses field kita butuh titik setelah nama object dan diikuti nama field nya//
       // person1.name = "Ikram";//Memasukan field dengan isinya ikram//
        //person1.address = "Jakarta";//Memasukan field dengan isinya jakarta//
        //person1.age = 20;//Memasukan field dengan isinya 20//
        //PersonClass.country = "amerika";// //Ini tidak bisa di ubah karena memakai tipe data FINAL//
        //Menambahkan Function//
        person1.sayHello("Nazwa");

        //Ini cara mencetak nya jik ingin satu2//
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.age);
        System.out.println(person1.country);
        //Ini cara mencetk nya menjadi sebuah kalimat//
        //System.out.println("Halo nama saya " + person1.name + " Saya tinggal di " + person1.address + " Umur saya " + person1.age + " Saya dari negara " + person1.country);//

        //Ini membuat yg kedua, sama seperti membuat person1//
        var person2 = new PersonClass("Nazwa", "Bandung", 19);
        //person2.name = "Nazwa";//
        //person2.address = "Bandung";//
        //person2.age = 19;//
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.age);
        System.out.println(person2.country);
        person2.sayHello("Ikram");


    }
}
