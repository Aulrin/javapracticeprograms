package com.niit.java.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListDemo {
	public static void main(String[] args) {
		List<Integer> n=new ArrayList<Integer>();
		
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(50);
		n.add(60);
		n.add(2,110);
		ArrayListDemo demo=new ArrayListDemo();
		demo.displayList(n);
	}

}
