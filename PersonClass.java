public class PersonClass {
    //Field/properties/attribute adalah data yg bisa kita sisipkan di dalam object//
    //tapi harus di deklarasikan data apa saja yg di miliki object tersebut di dalam dekrarasi classnya//
    //membuat Field/properties/attribute sama seperti membuat variable, tetapi di tempatkan di block class//
    static String name;//Menambahkan field name dengan tipe data String//
    static String address;//Menambahkan field address dengan tipe data String//
    static int age;//Menambahkan field age dengan tipe data int//
    final String country = "Indonesia";//Menambahkan field country dengan tipe data Final artinya tidak bisa di ubah lagi//

    //Constructor//
    //adalah function yg akan di panggil pertama kali object dibuat//
    //Kita bisa memberikan parametr pada constructor//
    //nama constructor harus sama seperti nama class nya//
    PersonClass(String paramName, String paramAddress, int paramAge){
        name = paramName;
        address = paramAddress;
        age = paramAge;
    }
    //Function//
    void sayHello(String paramName){
        System.out.println("Halo " + paramName + ", My name is " + name );
    }
}
