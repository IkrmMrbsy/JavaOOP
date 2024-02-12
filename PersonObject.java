public class PersonObject {
    public static void main(String[] args) {
        //Object adlh hasil instansiasi dari class//
        //membuat object kita bisa menggunakan kata kunci (new dan diikuti dengan nama classnya)//
        //Mmembuat object//
        //Jika pakai constructor, wajib memasukan parameter nya juga//
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

        //jika pakai constructor, wajib memasukan parameter nya juga//
        //jika pakai constructor, tidak perlu membuat field nya lagi//
        var person2 = new PersonClass("Zehan");//Dengan satu parameter(Constructor 2)//
        person2.sayHello("Ahmad");

        var person3 = new PersonClass();//Dengan Tanpa parameter(Constructor 3)//





    }
}
