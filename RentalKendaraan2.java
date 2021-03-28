import java.util.Scanner;

public class RentalKendaraan2 {

    int sewaMotor;
    double sewaMobil;
    int hari;

    Scanner input = new Scanner(System.in);

    public RentalKendaraan2(int sewaMotor) {
        this.sewaMotor = sewaMotor;
        System.out.println("=====================");
        System.out.println("Sewa perhari :" + sewaMotor);
    }

    public RentalKendaraan2(int sewaMobil, int hari) {
        this.sewaMobil = sewaMobil;
        this.hari = hari;
        int bayar = sewaMobil * hari;
        System.out.println("=====================");
        System.out.println("Sewa perhari :" + bayar);
    }

    public static void pilihan() {
        Scanner input = new Scanner(System.in);
        System.out.println("+----------------------------+");
        System.out.println("| Silahkan pilih Kendaraan : |");
        System.out.println("| 1. Roda dua                |");
        System.out.println("| 2. Roda empat              |");
        System.out.println("+----------------------------+");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        if (pilih == 1) {
            RentalKendaraan2.roda2();
        } else if (pilih == 2) {
            RentalKendaraan2.roda4();
        } else {
            System.out.println("Input salah! Masukan angka sesuai menu yang tersedia");
            pilihan();
        }

    }

    //    method roda 2 atau motor
    public static void roda2() {
        Scanner input = new Scanner(System.in);
        System.out.println("+-------------------+");
        System.out.println("| Pilih Jenis Motor |");
        System.out.println("+-------------------+");
        System.out.println("| 1.Vespa Sprint    |");
        System.out.println("| 2.Vespa Primavera |");
        System.out.println("| 3.Yamaha Nmax     |");
        System.out.println("| 4.Yamaha Aerox    |");
        System.out.println("| 5.Honda PCX       |");
        System.out.println("| 6.Honda Scoopy    |");
        System.out.println("+-------------------+");
        System.out.print("Masukan pilihan : ");
        int pilih1 = input.nextInt();
        switch (pilih1) {
            case 1:
                Kendaraan vespaSprint = new Motor();
                vespaSprint.setHargaSewa(180000);
                vespaSprint.setNamaKendaraan("Motor Vespa Sprint");
                vespaSprint.tampilDetailKendaraan();
                break;
            case 2:
                Kendaraan vespaPrimavera = new Motor();
                vespaPrimavera.setHargaSewa(170000);
                vespaPrimavera.setNamaKendaraan("Motor Vespa Primavera");
                vespaPrimavera.tampilDetailKendaraan();
                break;
            case 3:
                Kendaraan yamahaNmax = new Motor();
                yamahaNmax.setHargaSewa(120000);
                yamahaNmax.setNamaKendaraan("Motor Yamaha Nmax");
                yamahaNmax.tampilDetailKendaraan();
                break;
            case 4:
                Kendaraan yamahaAerox = new Motor();
                yamahaAerox.setHargaSewa(120000);
                yamahaAerox.setNamaKendaraan("Motor Yamaha Aerox");
                yamahaAerox.tampilDetailKendaraan();
                break;
            case 5:
                Kendaraan hondaPCX = new Motor();
                hondaPCX.setHargaSewa(150000);
                hondaPCX.setNamaKendaraan("Motor Honda PCX");
                hondaPCX.tampilDetailKendaraan();
                break;
            case 6:
                Kendaraan hondaScoopy = new Motor();
                hondaScoopy.setHargaSewa(100000);
                hondaScoopy.setNamaKendaraan("Motor Honda Scoopy");
                hondaScoopy.tampilDetailKendaraan();
                break;
            default:
                System.out.println("Input salah! Masukan angka sesuai menu yang tersedia");
                roda2();
        }
    }

    //    methode roda 4 atau mobil
    public static void roda4() {
        Scanner input = new Scanner(System.in);
        System.out.println("+-------------------+");
        System.out.println("| Pilih Jenis Mobil |");
        System.out.println("+-------------------+");
        System.out.println("| 1.Alphard         |");
        System.out.println("| 2.Fortuner        |");
        System.out.println("| 3.HRV             |");
        System.out.println("| 4.Avanza          |");
        System.out.println("| 5.Xenia           |");
        System.out.println("| 6.Agya            |");
        System.out.println("+-------------------+");
        System.out.print("Masukan pilihan : ");
        int pilih2 = input.nextInt();
        switch (pilih2) {
            case 1:
                Kendaraan alphard = new Mobil();
                alphard.setHargaSewa(1700000);
                alphard.setNamaKendaraan("Mobil Alphard");
                alphard.tampilDetailKendaraan();
                break;
            case 2:
                Kendaraan fortuner = new Mobil();
                fortuner.setHargaSewa(1000000);
                fortuner.setNamaKendaraan("Mobil Fortuner");
                fortuner.tampilDetailKendaraan();
                break;
            case 3:
                Kendaraan hrv = new Mobil();
                hrv.setHargaSewa(450000);
                hrv.setNamaKendaraan("Mobil HRV");
                hrv.tampilDetailKendaraan();
                break;
            case 4:
                Kendaraan avanza = new Mobil();
                avanza.setHargaSewa(300000);
                avanza.setNamaKendaraan("Mobil Avanza");
                avanza.tampilDetailKendaraan();
                break;
            case 5:
                Kendaraan xenia = new Mobil();
                xenia.setHargaSewa(300000);
                xenia.setNamaKendaraan("Mobil Xenia");
                xenia.tampilDetailKendaraan();
                break;
            case 6:
                Kendaraan agya = new Mobil();
                agya.setHargaSewa(250000);
                agya.setNamaKendaraan("Mobil Agya");
                agya.tampilDetailKendaraan();
                break;
            default:
                System.out.println("Input salah! Masukan angka sesuai menu yang tersedia");
                roda4();
        }
    }
}


    /*
    void tampilroda2(){
        int totalbayarroda2;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa (hari) : ");
        int lamasewaroda2=input.nextInt();
        totalbayarroda2=lamasewaroda2*sewaMotor;
        System.out.println("---------------------");
        System.out.println("Anda memilih motor " );
        System.out.println("Dengan harga sewa : " +totalbayarroda2);
        System.out.println("=====================");

    }

    void tampilroda4(){
        int totalbayarroda4;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa (hari) : ");
        int lamasewaroda4=input.nextInt();
        totalbayarroda4=(int) (lamasewaroda4*sewaMobil*hari);
        System.out.println("---------------------");
        System.out.println("Anda memilih mobil ");
        System.out.println("Dengan harga sewa : " +totalbayarroda4);
        System.out.println("===========================");

    }
     */


