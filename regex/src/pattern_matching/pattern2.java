package pattern_matching;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			String password=sc.next();
			String pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6}";
			if(password.matches(pattern))
			{
				System.out.println("valid password");
			}
			else
			{
				System.out.println("Invalid password\nPassword must contain uppercase,lowercase,numbers ,symbols");
			}


	}

}
