import java.util.*;
public class Mod14_P2 {
	private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
		double r,r1,r2,r3;

		System.out.println("Nilai R1 =");
		r1 = input.nextDouble();
		System.out.println("Nilai R2 =");
		r2 = input.nextDouble();
		System.out.println("Nilai R3 =");
		r3 = input.nextDouble();
		r = 1/(1/r1+1/r2+1/r3);
		System.out.println("Nilai R ="+ r);
	}
}
