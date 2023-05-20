import java.util.Scanner;
public class modul7_2{
public static void main (String arg[]){
	Scanner in=new Scanner(System.in);
	int nilai;
	System.out.print(Masukkan angka bulat (0 - 100) ");
	nilai=in.nextInt();
	if (nilai>=50)
	{
		if (nilai>=80)
		  System.out.println("Nilaimu bagus sekali");
		  else
		  System.out.println("Nilaimu bagus");
	}
		else
		System.out.println("Nilaimu kurang");
	}
}