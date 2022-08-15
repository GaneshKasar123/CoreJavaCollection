package com.csi.collectionrevision;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {
	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("INFOSYS");
		al.add("TCS");
		al.add("WIPRO");

		System.out.println(al.size());
		for (String s : al) {

			System.out.println(s);
		}

	}
}
