package home.edu.vn;

import java.util.Arrays;
import java.util.Scanner;

public class DemoString {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Demo1: login*/
		//login();
		
		/*Demo2: manageStudent*/
		//manageStudent();
		
		/*Demo3: splitString*/
		//splitString();
		
		/*Demo4: findAndReplace*/
		//findAndReplace();
		
		/*Demo5: utilityFunction*/
		//utilityFunction();		
	}
	
	private static void utilityFunction() {
		
		//String -> Immutable type
		String fullName = "Nguyễn Văn Tèo";
		double salary = 123.45678;
		String[] emails = {"teo@fpt.edu.vn","teo@fe.edu.vn","teo@gmail.com"};
		
		//format: get a string not using printf
		String s1 = String.format("%s has salary is %.2f", fullName,salary);
		System.out.println(s1);
		
		//join: find and replace str1 by str2
		String s2 = String.join("~", emails);//jdk 1.7 do not support join
		System.out.println(s2);
		
		//valueOf: convert number to string
		String s3 = String.valueOf(salary)+"2017";
		System.out.println(s3);
		
	}

	private static void findAndReplace() {
		
		System.out.print("Content String: ");
		String strContent = scanner.nextLine();
		
		System.out.print("Find String: ");
		String strFind = scanner.nextLine();
		
		System.out.print("Replace String: ");
		String strReplace = scanner.nextLine();
		
		String strResult = strContent.replaceAll(strFind, strReplace);
		
		System.out.printf("Result string is: %s",strResult);
		
	}

	private static void splitString() {
		
		System.out.print("Sequence of number: ");
		String sequenceOfNumber = scanner.nextLine();
		sequenceOfNumber = sequenceOfNumber.replaceAll(" ", "");
		
		String[] arr = sequenceOfNumber.split(",");
		System.out.println(Arrays.toString(arr));
		
		for(String number : arr){
			int x = Integer.parseInt(number.trim());
			if(x%2==0){
				System.out.print(x+" ");
			}
		}
		
	}

	private static void manageStudent() {
		
		String[] lstStudent = {
				"Nguyễn Văn Tuấn",
				"Lê Anh Tuấn",
				"Phạm Thị Mỹ Linh",
				"Trần Văn Cường",
				"Nguyễn Văn Mỹ"
		};
		
		//Output: person which last name is "TUẤN" or first name is "NGUYỄN"
		for(String student: lstStudent){
			String str = student.toUpperCase();
			if(str.startsWith("NGUYỄN")||str.endsWith("TUẤN")){
				System.out.println(str);
			}
		}
		
		System.out.println("=======================");
		//Output: person which middle name is "MỸ"
		for(String student: lstStudent){
			String str = student.toUpperCase();
			if(str.contains(" MỸ ")){
				int i = str.lastIndexOf(" ");
				String firstName = str.substring(i+1,str.length());
				System.out.println(firstName);
			}
		}
		
	}

	private static void login() {
		
		System.out.print(">> Username: ");
		String id = scanner.nextLine();		
		System.out.print(">> Password: ");
		String pw = scanner.nextLine();	
		
		if(id.equalsIgnoreCase("hello")){
			if(pw.length()>=6){
				System.out.println("Login Successfully!");
			}
			else{
				System.out.println("Incorrect Password!");
			}
		}
		else{
			System.out.println("Incorrect Username!");
		}
		
	}
		
}
