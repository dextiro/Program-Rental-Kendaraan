import java.util.Scanner;

/* Program ini dibuat oleh :
- Nama           : Kadek Deksy Dextiro
- NIM            : 2005551078
- Kelas          : Pemrograman Berorientasi Obyek (D)
- Dosen Pengampu : A.A Ketut Agung Cahyawan Wiranatha, ST, MT
 */

public class RentalKendaraan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t +-----------------------------------------+");
        System.out.println("\t\t\t | Selamat datang di per-RENTAL-an Duniawi |");
        System.out.println("\t\t\t +-----------------------------------------+\n");

        RentalKendaraan2.pilihan();

        System.out.println("===========================");
        System.out.print("Transaksi lagi Ya=1 Tidak=2 : ");
        int hari=input.nextInt();
        if(hari==1){
            // pemangilan kelas rental dan method pilihan
            // nama class.nama method
            RentalKendaraan2.pilihan();
        } else if(hari==2){
            System.out.println("\nTerima Kasih");
        } else{
            System.out.println("Input salah!");
        }


    }
}
