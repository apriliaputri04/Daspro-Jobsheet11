import java.util.Scanner; //untuk menambahkan input dari output ke dalam program

public class SegitigaAngka { //nama file java
    public static void main(String[] args){ //method main java
        Scanner input = new Scanner(System.in); //untuk membuat objek Scanner bernama input digunakan untuk mengambil input dari pengguna melalui keyboard
                                                // dan menyimpannya ke dalam sistem

        System.out.print("Masukkan angka (Min.3) : "); //menampilkan input angka minimal 3
        int number = input.nextInt(); //memasukkan input int number ke dalam sistem sistem kemudian disimpan

        if (number >2){ //untuk memeriksa apakah nilai variabel number lebih besar dari 2
            for (int i=0; i < (number); i++){//untuk i=0, dengan kondisi i<input yang dimasukkan
                for (int j = (number-1); j>i; j--){//masuk perulangan dalam, int j = (number-1); menganalisis variable  bernama j ke nilai angka number-1
                    //kondisi j<i; kondisi ini untuk memeriksa apakah nilai j lebih besar dari i. Jika kodisinya benar,perulangan dilanjutkan. 
                    //Jika kondisinya salah perulagan berakhir.
                    //j-- untuk mengurangi nilai j sebesar 1
                    // kode diantara kurung kurawal {} dieksekusi berulang kali hingga kondisi j>i false.
                System.out.print(" ");//untuk menghasilkan output innerloop yang akan dicetak
                }//inner loop level 2
                for (int k = 0; k <= i; k++){//untuk melakukan iterasi melalui serangkaian angka dari 0 hingga i, termasuk i
                    System.out.print(k+1);//untuk mencetak nilai variable k akan di increment menjadi 2
                }// inner loop level 2
                System.out.println();//digunakan untuk mencetak baris baru
            }//outer loop level 1
        }
    }
}