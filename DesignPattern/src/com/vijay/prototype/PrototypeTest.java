package com.vijay.prototype;

import java.util.HashSet;
import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.loadData();
		
		Employee emp1 = (Employee) emp.clone();
		Employee emp2 = (Employee) emp.clone();
		
		List<String> list = emp1.getList();
		list.addAll(emp2.getList());
		
		HashSet<String> set = new HashSet<String>(list);
		set.forEach(System.out::println);
		
		list.removeAll(list);
		list.addAll(set);
		System.out.println("Set to List");
		list.forEach(System.out::println);

	}

}
