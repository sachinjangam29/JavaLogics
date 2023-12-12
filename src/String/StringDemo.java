package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringDemo {
	public static void main(String are[]) {
		String str = "SACHINJANGAM";
		int cnt=0;
		int num =0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<str.length();i++) {
			cnt=0;
			for(int j=0; j<str.length(); j++) {
				if(j == str.length()-1) {
					map.put(str.charAt(i), cnt);
				}
				
				if(str.charAt(i) == str.charAt(j)) {
					cnt++;
					}
				}
			if(i == str.length()-1) {
				map.put(str.charAt(i), cnt);
			}
			}
		
		System.out.println(map);
		}
	
	
}
