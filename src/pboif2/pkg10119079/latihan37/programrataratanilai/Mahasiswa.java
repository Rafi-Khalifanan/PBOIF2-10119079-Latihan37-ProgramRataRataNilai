package pboif2.pkg10119079.latihan37.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
class RataRata {
    public int mahasiswa;
    public float jumlah,nilai;

    
    public void banyakNilai(){
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(i<=mahasiswa){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = input.nextFloat();
            jumlah += nilai;
            i++;
        }
    }
    
    public float hitungRataRata(){
        float rata = jumlah/mahasiswa;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        return rata;
    }  
}