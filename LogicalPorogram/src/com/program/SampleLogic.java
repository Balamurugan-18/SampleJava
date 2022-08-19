package com.program;

import java.util.LinkedList;
import java.util.List;

public class SampleLogic {
public static void main(String[] args) {
	String name = "java Automation Engineer Gopal";
	
	String out = "";
	String [] split = name.split(" ");
	
	List<String> s = new LinkedList<>();
	
	for(String m:split) {
		s.add(m);
	}
	
	for(int i = 0;i<s.size();i++) {
		String st = s.get(i);
		String tr = "";
		if(i==1||i==3) {
			
			for(int j =s.size()-1;j>=0;j--) {
				char c = st.charAt(j);
				
				tr=tr+c;
			}
		}else {
		tr = tr+st;
		}
		out = out + tr;
	}
	System.out.println(out);
}
}
