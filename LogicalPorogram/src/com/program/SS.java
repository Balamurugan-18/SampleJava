package com.program;

import java.util.ArrayList;
import java.util.List;

public class SS {

	public static void main(String[] args) {
		String s = "BaLA23@&";
		String sm = "";
		String up = "";
		String num = "";
		String sc = "";

		String m = "";

		char[] ca = s.toCharArray();

		List<Character> l = new ArrayList<>();
		for (char t : ca) {
			l.add(t);
		}
		for (int i = 0; i < l.size(); i++) {
			Character c = l.get(i);

			if (c >= 0 && c <= 47 || c >= 48 &&c<=57|| c >= 58 && c <= 64 || c >= 91 && c <= 96 || c >= 123 && c <= 127) {
				m = m+c;
			}
			
		}
		System.out.println(m);
	}
}