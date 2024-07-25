package Practice.Practice;

import java.util.HashMap;
import java.util.LinkedList;

public class ConvertMapToList {

//			In this we have to convert hashmap into thr list

	public static void main(String[] args) {

		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("id", 100);
		hm.put("empname", "Rabi");
		hm.put("empdep", "admin");

		LinkedList<Object> list = new LinkedList<Object>(hm.values());
		System.out.println(list);
		

	}

}
