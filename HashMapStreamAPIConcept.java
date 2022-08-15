package com.csi.collectionrevision;

import java.util.HashMap;
import java.util.Map;

public class HashMapStreamAPIConcept {
	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<>();
		hm.put("NAME", "SWARA");
		hm.put("ADDRESS", "PUNE");
		hm.put(null, "346556");
		hm.put(null, "ABC");

		System.out.println("HashMap Size: "+ hm.size());
		/*for (Map.Entry<String, String> m : hm.entrySet()) {
			System.out.println("" + m.getKey() + ": " + m.getValue());
		}*/
		
		//hm.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		hm.entrySet().stream()
	      .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
	}
}
