package com.vijay.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

	List<String> list = null;
	
	public Employee(){
		list = new ArrayList<>();
	}
	
	public void loadData(){
		list.add("a");
		list.add("d");
		list.add("dasdc");
		list.add("dss");
	}
	
	public Employee(List<String> list) {
		this.list=list;
		
	}
	
	public List<String> getList() {
		return list;
		
	}
	@Override
	public Object clone(){
		List<String> temp = new ArrayList<>();
		
		for(String s : this.getList()){
			temp.add(s);
		}
		return new Employee(temp);
	}
}
