package BelajarPackage.Application;

//Import adalah kemampuan menggunakan class yg berbeda di package yg berbeda
//Syarat class yg bisa di gunakan jika packagenya berbeda adalah class yg public
import BelajarPackage.Data.CategoryGetSet;
import BelajarPackage.Data.City;
import BelajarPackage.Data.Location;
import BelajarPackage.Data.Product;//nama package diikuti nama class nya(Product)
//kalau mau import semua class yg ada di package kita bisa pakai(*)setelah nama packagenya
//Seperti ini -> import BelajarPackage.Data.*;


public class Application {
    public static void main(String[] args) {
        //BAGIAN ACCESS MODIFIER//
        Product product = new Product("Asus", 20_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
        //BAGIAN ACCESS MODIFIER//

        //BAGIAN ABSTRACT//
        //Location location = new Location(); ->jika membuat object baru dari abstract class akan error
        City city = new City();
        city.nameLocation = "Jakarta";
        city.run();//Abstract Method
        System.out.println(city.nameLocation);
        //BAGIAN ABSTRACT//

        //BAGIAN ENCAPSULATION(getter setter)//
        CategoryGetSet category = new CategoryGetSet();
        category.setId("ID");
        category.setId(null);//Walaupun kita ubah ke null, outputnya tetap "ID"
        //Jadi ngambil data nya pakai method bukan lagi pakai field nya
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
        //BAGIAN ENCAPSULATION(getter setter)//

    }
}
