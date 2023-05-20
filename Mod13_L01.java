
import java.util.Random;
import java.util.Scanner;
public class Mod13_L01 {
	public static void main(String[] args) {
		int bil,i,acak,terkecil;
		Scanner masuk = new Scanner(System.in);
		Random rd=new Random();
		System.out.print("Masukkam Jumlah Bilangan = ");
		bil = masuk.nextInt();
		if(bil < 10) {
			for(i=1; i<=5; i++) {
				acak = rd.nextInt(10);
				System.out.println(acak);
			}
		}
	}
}