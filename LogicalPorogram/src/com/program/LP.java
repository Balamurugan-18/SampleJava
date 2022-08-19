package com.program;

import java.util.ArrayList;
import java.util.List;

public class LP {

	public static void main(String[] args) {
		
	
	String s ="Bala23456";
	String rev ="";
	
//	String s1=" ";
//	
//	for(int i=s.length()-1;i>=0;i--) {
//		char charAt = s.charAt(i);
//		s1=s1+charAt;
//		
//	}
//	System.out.print(s1);
	
	
	char[] ch = s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		rev=rev+ch[i];
		
	}
	System.out.println(rev);
	
}
}