package pkg3;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {
public static void main(String[] args) {
	 HashMap<Integer, String> h1=new HashMap<>();
	 h1.put(1,"abc");
	 h1.put(2,"xyz");
	 Set<Entry<Integer,String>> entries=h1.entrySet();
	 for(Entry<Integer,String> e1: entries) {
		 System.out.println(e1);
	 }
	 for(Entry<Integer,String> e1: entries) {
		 System.out.println(e1.getKey());
	 }
	 for(Entry<Integer,String> e1: entries) {
		 System.out.println(e1.getValue());
	 }
}
 
}
