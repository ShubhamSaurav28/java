package lec20;

import java.util.ArrayList;

public class Arraylist_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		for(int x:list) {
			System.out.print(x);
		}
	}

}
