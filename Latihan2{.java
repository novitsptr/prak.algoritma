				import java.util.Scanner;
				public class Latihan2{
					private static Scanner scan = new Scanner(System.in);
					public static void main(String[]args){
						int awal,akhir;

						System.out.print("Masukkan nilai awal = ");
						awal = scan.nextInt();

						System.out.print("Masukkan nilai akhir = ");
						akhir = scan.nextInt();

						for(int i = awal;i <= akhir;i++){
							if(i % 5 == 0){
								System.out.println(i);
								}
							}
						}
					}