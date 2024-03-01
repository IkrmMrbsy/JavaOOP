package BelajarPackage.Data;

//Abstract class adlh class tersebut tidak bisa di buat object secara langsung hanya bisa di turunkan
//untk membuat class menjadi abstract, kita harus pakai kata kunci ABSTRACT sblm kata kunci class
//Abstract class bisa kita gunakan sebagai kontrak (Dimana sebuah class itu harus turunan dari abstract class tersebut)
public abstract class Location {
   public String nameLocation;

   //Abstract Method//
   //Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method
   public abstract void run();//Hanya seperti ini saja dan abstract method tidk boleh private
   //Seakan akan class child nya harus wajib membuat method tersebut
   //Jadi jika kita ingin memaksa semua class turunanya mempunyai method tersebut tinggal buat abstract method//
   //Abstract Method//
}



