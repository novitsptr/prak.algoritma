/*
Program menampilkan bilangan genap sesuai input user 
dev	: Novit Saputri
dt	: 12/11/21 09:36
*/
import java.util.Scanner;
public class modul8_5{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int awal,akhir;
		
		System.out.print("masukkan nilai awal : ");
		awal = input.nextInt();
		System.out.print("masukkan nilai akhir : ");
		akhir = input.nextInt();
		
		while(awal <= akhir){
			if(awal % 2 == 0) {
				System.out.println(awal);
				}
				awal++;
				
			}
		}
	}
}