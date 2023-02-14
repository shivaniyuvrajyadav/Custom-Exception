import java.util.*;
public class InvalidAgeException extends Exception{
	public InvalidAgeException(){
	super("the age is not valid");
	}
	public static void main(String[]args) throws InvalidAgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		if(age<18) {
			throw new InvalidAgeException();
			
		}
		System.out.println("eligible to vote ");
	}
				
}