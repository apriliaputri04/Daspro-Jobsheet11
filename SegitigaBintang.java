import java.util.Scanner;//untuk menambahkan input dari output ke dalam program

public class SegitigaBintang{// nama file java
    public static void main(String[] args){//method main java
        Scanner input = new Scanner(System.in); //untuk membuat objek Scanner bernama input digunakan untuk mengambil input dari pengguna melalui keyboard
                                                // dan menyimpannya ke dalam sistem

        System.out.print("Masukkan Nilai (Min.5) : ");//masukkan input number tipe integer ke dalam sistem kemudian disimpan
        int number = input.nextInt();//memasukkan input int number ke dalam sistem sistem kemudian disimpan

        if (number >4){ //untuk memeriksa apakah nilai variabel number lebih besar dari 4
            for (int i = (number); i>0; i--){//int i= (number); menganalisis variable i ke nilai angka, i>0; memeriksa apakah nilai i lebih besar dari 0,
                                            // i--; untuk mengurangi nilai 1 sebesar 1
                for (int j=0; j<i; j++){//untuk melakukan iterasi melalui serangkaian angka dari 0 hingga i-1, termasuk i-1
                    System.out.print("*");//untuk mencetak karakter * sebanyak j<i
                }
                System.out.println();//digunakan untuk mencetak baris baru
            }
        }

    }
}