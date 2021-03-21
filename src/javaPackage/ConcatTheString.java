package javaPackage;

public class ConcatTheString {

	public static void main(String[] args) {

    /*You can write this program in two way*/
		
//		String s1 = "what";
//
//		s1 = s1.concat("is");
//
//		s1 = s1.concat("your");
//
//		s1 = s1.concat("exp");
//
//		System.out.println(s1);


		String s1 = "what";

		s1 = s1.concat("is").concat("your").concat("exp");

		System.out.println(s1);
	}

}
