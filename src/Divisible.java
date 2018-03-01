import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int n=scan.nextInt();

if (n%2==0){
if (n%3==0){
	System.out.println("True");
}else{
	System.out.println("False");
}
}
	}

}
