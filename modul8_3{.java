import java.util.Scanner;
public class modul8_3{
	public static void main(String [] args){
		boolean running = true;
		int counter = 0;
		String jawab;
		Scanner scan = new Scanner(System.in);
		while(running){
			System.out.println("STMIK AKAKOM");
			System.out.println("Tampilan Tulisan lagi [ya/tidak]?");
			jawab = scan.nextLine();
			
			// cek jawabannya, kalau ya maka berhenti mengulang 
			if(jawab.equalsIgnoreCase("tidak")){
				running = false;
			}
				counter++;
			}
			System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+" kali");
			
		}
	}
