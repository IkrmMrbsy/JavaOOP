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
    PersonClass(String Name2, String Address2, int Age2){
        name = Name2;
        address = Address2;
        age = Age2;
    }

    //Constructor Overloading//
    //Bisa membuat constructor lebih dari satu, dengan syarat tipe data/ jumlah parameter berbeda//
    PersonClass(String Name2){//Dengan 1 parameter, jika jumlah/tipe data nya sama seperti di atas, akan error//
        //name = Name2;->Jika seperti ini sebenarnya tidak baik, karena kode nya sama seperti di atas//
        //Lebih baik memakai (this)//
        //Constructor bisa memanggil constructor yang lain//
        //Memanggil nya dengan kata kunci (this)//
        this(Name2, null, 0);//Lebih baik seperti ini//
    }

    PersonClass(){//Dengan tanpa parameter//

        this(null);
    }
    //Constructor Overloading//
    //Function//
   void sayHello(String NamaKedua){

        System.out.println("Hello " + NamaKedua + ", My name is " + name);
   }
}
