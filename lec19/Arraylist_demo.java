package lec19;

import java.util.ArrayList;

public class Arraylist_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(1,50);//index range = 0 to size
		System.out.println(list.size());
		System.out.println(list);
		//remove
		System.out.println(list.remove(3));
		System.out.println(list);
		list.add(2);
		list.add(3);
		System.out.println(list.get(3));
		System.out.println(list);
		list.set(1,40);
		System.out.println(list);
		
	}

}
