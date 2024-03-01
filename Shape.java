class Shape {
    //Super Keyword//
    //Ketika kita ingin mengakses method yg terdapat di parent class, bisa pakai (Super)//
    //Kata kunci SUPER itu untuk mengakses class parent//
    //Tidak hanya method, field juga bisa kita akses pakai kata kunci SUPER//
    //Jadi this itu untuk mengakses object saat ini, kalau super untuk parent nya//
    int getCorner(){

        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }
    int getParentCorner(){
        return super.getCorner();//Jika di tambahkan super akan memanggil yg parentnya//
    }
}


