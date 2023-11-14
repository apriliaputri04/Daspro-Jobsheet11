import java.util.Scanner;//untuk menambahkan input dari output ke dalam program

public class KotakAngka{// nama file java
    public static void main(String[] args){//method main java
        Scanner input = new Scanner(System.in);//untuk membuat objek Scanner bernama input digunakan untuk mengambil input dari pengguna melalui keyboard
                                            // dan menyimpannya ke dalam sistem

        System.out.print("Masukkan angka (min.3): ");//menampilkan input angka minimal 3
        int angka = input.nextInt();//untuk membaca nilai integer dari input dan menyimpanyya ke dalam variable angka

        if (angka >2){//untuk memeriksa apakah nilai variable angka lebih besar dari 2
            for (int i=0; i<angka; i++){//int i=0; menganalisis variable i ke nilai 0, i<angka; memeriksa apakah nilai i lebih kecil dari nilai angka,
                                        // i++; menambah nilai i sebesar 1 setelah setiap iterasi perulangan
                for (int j=0; j<angka; j++){//untuk melakukan iterasi melalui serangkaian angka dari 0 hingga i-1, termasuk i-1
                    if(i== 0 || i== angka-1 || j==0 || j==angka-1){//untuk memeriksa apakah nilai variable i atau j sama dengan 0 atau sama dengan nilai variable angka dikurangi 1
                        System.out.print(angka + " ");//untuk mencetak nilai variable angka diikuti dengan satu spasi
                    }else {
                        System.out.print("  ");//untuk mencetak nilai variable angka diiukti dengan dua spasi
                    }
                }
                System.out.println();//digunakan untuk mencetak baris baru
            }
        }
    }
}