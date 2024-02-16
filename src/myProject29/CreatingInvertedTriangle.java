package myProject29;
import java.util.Scanner;

public class CreatingInvertedTriangle {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int size;
		System.out.print("Please enter a number to arrange size of triangle:");
		size=input.nextInt();
		for(int i=1;i<=size;i++) {
			for(int k=2*(size-i)+1;k>=1;k-=1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
