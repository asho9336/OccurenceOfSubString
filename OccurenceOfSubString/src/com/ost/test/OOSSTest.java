package com.ost.test;

public class OOSSTest {
	public static void main(String[] args) {
		String str = "Hello Hello java Hello welcome me Hello welcome Hello";
		int count=0;
		String[] str2=str.split(" ");
		
		for(int i=0; i<str2.length; i++ ){
			if(str2[i].equals("Hello")){
				count++;
				
				System.out.println("Cont value "+count);
				System.out.println("Second check in");
			}
		}
			System.out.println("No of occurenceOf Hello : "+count);
	}
}


