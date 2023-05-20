package latihan11;

import java.util.Scanner;

public class BilanganKelipatan {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print ("Masukkan Bilangan : ");
			int n = input.nextInt(); // Menentukan Jumlah Bilangan

			for (int i=1; i<=n; i++) {

				for(int j=1; j<=5; j++) {
					System.out.print(j*i+" ");
				}
				System.out.println();
			}
		}
	}
