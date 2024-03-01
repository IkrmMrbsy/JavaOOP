package BelajarPackage.Data;

//Encapsulation
//Memastikan data sensitif sebuah object tersembunyi dari akses luar
//Biasanya kita akan membuat field dengan private, sehingga tidak bisa di akses/diubah dri luar
//boolean -> getter is(nama field) kalau setter set(nama field)
//primitif -> getter get(nama field) kalau setter set(nama field)
//object -> getter get(nama field) kalau setter set(nama field)
public class CategoryGetSet {
    private String id;//Pakai Private
    private boolean expensive;//Pakai private

    public String getId() {//Getter Function untuk mengambil data field
        return id;//Untuk mendapatkan data id nya
    }

    public void setId(String id) {//Setter function untuk mengubah data field
        if (id != null){//Menambahkan Validasi di setter nya
            this.id = id; //Untuk merubah id nya
        }
    }

    public boolean isExpensive() {//Getter
        return expensive;
    }

    public void setExpensive(boolean expensive) {//Setter
        this.expensive = expensive;
    }
}
