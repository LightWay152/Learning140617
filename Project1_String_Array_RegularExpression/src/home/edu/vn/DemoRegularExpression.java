package home.edu.vn;

import java.util.Scanner;

public class DemoRegularExpression {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Demo1: validatePersonalInfo*/
		validatePersonalInfo();
		
	}

	private static void validatePersonalInfo() {
		
		System.out.print("Email: ");
		String email = scanner.nextLine();
		
		System.out.print("Mobile: ");
		String mobile = scanner.nextLine();

		System.out.print("Moto: ");
		String moto = scanner.nextLine();
		
		System.out.print("Id Card: ");
		String idCard = scanner.nextLine();
		
		StringBuffer errors = new StringBuffer();
		
		if(!email.matches("\\w+@\\w+(\\.\\w{2,4}){1,2}")){
			errors.append("Invalid Email!\r\n");
		}
		if(!mobile.matches("0\\d{9,10}")){
			errors.append("Invalid Mobile!\r\n");
		}
		if(!moto.matches("5\\d-[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))")){
			errors.append("Invalid Moto!\r\n");
		}
		if(!idCard.matches("[0-9]{9}")){
			errors.append("Invalid Id Card!\r\n");
		}
		
		if(errors.length()==0){
			System.out.println("Congratulation! Your input is correct!");
		}
		else{
			System.out.println("Your input is incorrect. Please fix some error like below!");
			System.out.println(errors);
		}
		
	}

}
