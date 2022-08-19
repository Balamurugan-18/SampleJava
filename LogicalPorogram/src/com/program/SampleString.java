package com.program;

public class SampleString {

	public static void main(String[] args) {
//		String st= "BalaMurugan@%%9600";
//		int s=0,c=0,sp=0,n=0;
//		
//		String small="",capital="",spl="",num="";
//		
//		for(int i=0;i<st.length();i++) {
//			
//			char ch = st.charAt(i);
//			if(ch>=97&&ch<=122) {
//				s++;
//				small=small+ch;
//			}
//			if (ch>=65&&ch<=90) {
//				c++;
//				capital=capital+ch;
//			}
//			if(ch>=48&&ch<=57) {
//				n++;
//				num=num+ch;
//			}
//			else {
//				sp++;
//			spl=spl+ch;
//			}
//			
//		}
//		
//		System.out.println(small+"--------"+s);
//		System.out.println(capital+"--------"+c);
//		System.out.println(num+"--------"+n);
//		System.out.println(spl+"--------"+sp);

		int n = 20;
		int evencount = 0;
		int oddcount = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				evencount++;
				if (evencount == 1 || evencount == 2) {
					System.out.println("The Even no is : " + i);
				}
			} else {
				oddcount++;
				if (oddcount == 1 || oddcount == 2) {
					System.out.println("The odd no is : " + i);
				}
			}
		}

	}

}
