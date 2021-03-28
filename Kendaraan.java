import java.util.Scanner;

public class Kendaraan {

    private int hargaSewa;
    private String namaKendaraan;

    public void tampilkanCCMesin(){
        System.out.println("");
    }

    public int getHargaSewa() {
        return this.hargaSewa;
    }

    public void setHargaSewa(int harga) {
        this.hargaSewa = harga;
    }

    public void setNamaKendaraan(String nama) {
        this.namaKendaraan = nama;
    }

    public String getNamaKendaraan() {
        return this.namaKendaraan;
    }

    public void tampilDetailKendaraan(){
        int totalbayar;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa (hari) : ");
        int lamasewa=input.nextInt();
        totalbayar=lamasewa*this.hargaSewa;
        System.out.println("---------------------");
        System.out.println("Anda memilih " + this.namaKendaraan );
        System.out.println("Dengan harga sewa : " +totalbayar);

    }
}
