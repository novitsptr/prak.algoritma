import java.util.Scanner;

public class Segitiga {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // menampung input dari user
        int sisi1,sisi2,sisi3;
        // a = sisi miring,b dan c = sisi lainnya
        int a,b,c;

        // inputan user
        System.out.print("Masukkan sisi 1 : ");
        sisi1 = input.nextInt();
        System.out.print("Masukkan sisi 2 : ");
        sisi2 = input.nextInt();
        System.out.print("Masukkan sisi 3 : ");
        sisi3 = input.nextInt();

        // menentukan sisi miring
        if(sisi1 >= sisi2 && sisi1 >= sisi3){
            a = sisi1;
            b = sisi2;
            c = sisi3;
        }else if(sisi2 >= sisi1 && sisi2 >= sisi1){
            a = sisi2;
            b = sisi1;
            c = sisi3;
        }else{
            a = sisi3;
            b = sisi1;
            c = sisi2;
        }

        // menentukan jenis segitiga
        if(a*a == (b*b + c*c)){
            System.out.println("Segitiga Siku-Siku");
        }else if(a*a > (b*b + c*c)){
            System.out.println("Segitiga Tumpul");
        }else{
            System.out.println("Segitiga Lancip");
        }
    }
}