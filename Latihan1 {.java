/* program menghitung kredit mobil
    matkul : pAlgo 2021
    dev    : Novit Saputri
 */
import java.util.Scanner;
class Pilihan1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        int pilihan;

        System.out.print("-- Program Kredit Kendaraan Murah --\nPilihan : \n1.Mobil\n2.Motor\nMasukkan Pilihan :");
        pilihan = input.nextInt();

        if(pilihan == 1){
            System.out.print("-- Daftar Mobil --\nPilihan : \n1.Jazz\n2.Brio\n3.Mobilio\nMasukkan Pilihan :");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.println("harga kendaraan yang anda pilih honda jazz : Rp 170.000.000");
                    break;
                case 2:
                    System.out.println("harga kendaraan yang anda pilih honda brio : Rp 120.000.000");
                    break;
                case 3:
                    System.out.println("harga kendaraan yang anda pilih honda mobilio : Rp 170.000.000");
                    break;
                default:
                    System.out.println("pilihan tidak dapat di proses");
