import java.util.Scanner;
public class Mod14_P4 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float j=0,n,r,x;
		int i=1;

		System.out.print("Banyaknya Data : ");
		n = in.nextInt();
		while(i <= n) {
			System.out.print("Nilai ke-"+i+" : ");
			x = in.nextInt();
			j+=x;
			i++;
		}
		r=j/n;
		System.out.println("Rata-rata : "+ r);
	}
}
