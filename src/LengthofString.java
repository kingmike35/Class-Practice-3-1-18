import java.util.Scanner;
public class LengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a word");
String word=scan.nextLine();

int index=word.length();

if (index%2==0){
System.out.println("Even");
}else{
System.out.println("odd");	
}



	}

}
