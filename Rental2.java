import java.util.Scanner;

public class Rental2 {

    int sewaMotor;
    double sewaMobil;
    int hari;

    Scanner input = new Scanner(System.in);
    //    constructor over loading rental untuk motor
    public Rental2(int sewaMotor){
        this.sewaMotor=sewaMotor;
        System.out.println("=====================");
        System.out.println("Sewa perhari :" +sewaMotor);
    }
    //    constructor over loading rental untuk mobil
    public Rental2(int sewaMobil,int hari){
        this.sewaMobil=sewaMobil;
        this.hari=hari;
        int bayar=sewaMobil*hari;
        System.out.println("=====================");
        System.out.println("Sewa perhari :" +bayar);
    }
    public static void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("+----------------------------+");
        System.out.println("| Silahkan pilih Kendaraan : |");
        System.out.println("| 1. Roda dua                |");
        System.out.println("| 2. Roda empat              |");
        System.out.println("+----------------------------+");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        if (pilih==1) {
            Rental2.roda2();
        } else if(pilih==2) {
            Rental2.roda4();
        } else {
            System.out.println("Input salah! Masukan angka sesuai menu yang tersedia");
            pilihan();
        }

    }
    //    method roda 2 atau motor
    public static void roda2(){
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
        int pilih1=input.nextInt();
        switch(pilih1){
            case 1:
                Rental2 vespaSprint=new Rental2(180000);
                vespaSprint.tampilroda2();
                break;
            case 2:
                Rental2 vespaPrimavera=new Rental2(150000);
                vespaPrimavera.tampilroda2();
                break;
            case 3:
                Rental2 yamahaNmax=new Rental2(150000);
                yamahaNmax.tampilroda2();
                break;
            case 4:
                Rental2 yamahaAerox=new Rental2(120000);
                yamahaAerox.tampilroda2();
                break;
            case 5:
                Rental2 hondaPCX=new Rental2(150000);
                hondaPCX.tampilroda2();
                break;
            case 6:
                Rental2 hondaScoopy=new Rental2(100000);
                hondaScoopy.tampilroda2();
                break;
            default :
                System.out.println("Input salah! Masukan angka sesuai menu yang tersedia");
                roda2();
        }
    }

    //    methode roda 4 atau mobil
    public static void roda4(){
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
        int pilih2=input.nextInt();
        switch(pilih2){
            case 1:
                Rental2 alphard=new Rental2(1700000,1);
                alphard.tampilroda4();
                break;
            case 2:
                Rental2 fortuner=new Rental2(1000000,1);
                fortuner.tampilroda4();
                break;
            case 3:
                Rental2 hrv=new Rental2(450000,1);
                hrv.tampilroda4();
                break;
            case 4:
                Rental2 avanza=new Rental2(300000,1);
                avanza.tampilroda4();
                break;
            case 5:
                Rental2 xenia=new Rental2(300000,1);
                xenia.tampilroda4();
                break;
            case 6:
                Rental2 agya=new Rental2(250000,1);
                agya.tampilroda4();
                break;
            default :
                System.out.println("Input salah! Masukan angka sesuai menu yang tersedia");
                roda4();
        }
    }
    void tampilroda2(){
        int totalbayarroda2;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa (hari) : ");
        int lamasewaroda2=input.nextInt();
        totalbayarroda2=lamasewaroda2*sewaMotor;
        System.out.print("Anda memilih motor " );
        System.out.println("dengan harga sewa : " +totalbayarroda2);
    }
    void tampilroda4(){
        int totalbayarroda4;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa (hari) : ");
        int lamasewaroda4=input.nextInt();
        totalbayarroda4=(int) (lamasewaroda4*sewaMobil*hari);
        System.out.print("Anda memilih mobil ");
        System.out.println("dengan harga sewa : " +totalbayarroda4);
    }

}

