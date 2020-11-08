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
public class PBOIF210119079Latihan37ProgramRataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RataRata nilai = new RataRata();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nilai.mahasiswa = input.nextInt();
        
        nilai.banyakNilai();
        nilai.hitungRataRata();
    }
    
}
