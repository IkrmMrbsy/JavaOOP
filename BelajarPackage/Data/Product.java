package BelajarPackage.Data;

//Acces Modifier//
//Public -> Bisa di akses di class,package,subclass,world(Luar package)
//Protected -> Bisa di akses di class,package,subclass, tidak bisa di world
//no Modifier -> Bisa di akses di class,package,tidak bisa di subclass dan world
//Private -> Bisa di akses di class tidak bisa di package,subclass dan world

//Saat membuat (Public) kita hanya bisa membuat 1 public di 1 file java
//Dan nama public harus sama seperti nama file

public class Product {
        //protected String name;//Artinya hanya bisa di akses di turunanya dan di package yg sama

          public String name;
          public int price;

        public Product(String name, int price){
            this.name = name;
            this.price = price;
        }
    }

