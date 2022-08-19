   package com.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SampleString2 {
	public static void main(String[] args) {
		
//		String s = "Ram@&*%$#7865433";
//		String up ="";
//		String low="";
//		String num="";
//		String spl="";
//		int upp=0,loww=0,numm=0,spll=0;
//		char[] cs = s.toCharArray();
//		
//		List<Character> l =new ArrayList<>();
//		
//		for(char t:cs) {
//			l.add(t);
//			
//		}
//		for (int i = 0; i < l.size(); i++) {
//			Character c = l.get(i);
//			if (Character.isUpperCase(c)) {
//				up=up+c;
//				upp++;	
//				
//			}else if (Character.isLowerCase(c)) {
//				low=low+c;
//				loww++;
//				
//			}else if (Character.isDigit(c)) {
//				num=num+c;
//				numm++;
//				
//			}else {
//				spl=spl+c;
//				spll++;
//				
//			}
//					
//		}
//		System.out.println(up+"-------"+upp);
//		System.out.println(low);
//		System.out.println(num);
//		System.out.println(spl);
		
		String name = "aaabba";
		
		
		char[] cs = name.toCharArray();
		
		Map <Character,Integer> m = new LinkedHashMap<>();
		for(char f:cs) {
	
			if(m.containsKey(f)){
				Integer nu = m.get(f);
				m.put(f, nu+1);
			}else {
				m.put(f, 1);
			}
		}
		
		System.out.println(m);
//		String ab="";String cd="";
//		char[] c = name.toCharArray();
//		List<Collections> l = new ArrayList<>();
//		for (Collections collections : l) {
//			
//		}
		
	}

}
