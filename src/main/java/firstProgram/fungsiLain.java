package firstProgram;

//contoh panggil fungsi dari beda package
import contoh.hasil;

public class fungsiLain {
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        int z = 10;
        int v = 5;

        //memanggil fungsi di class lain
        namaKu.Indah( "Ujang");
        namaKu.Indah( "Aaaa");
        namaKu.Indah( "Bbb");

        //memanggil fungsi dari beda package
        hasil.printNama("Beda package");

        tambah(x,y);
        tambah(y,z);
        tambah(x,z);
        tambah(v,z);
    }

    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah : "+hasilTambah);
        return hasilTambah;
    }
}
