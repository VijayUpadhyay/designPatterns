package com.vijay.singletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerialisedTest {
	public static void main(String[] args) {
		SingletonDesignPatternSerialize obj = SingletonDesignPatternSerialize.getInstance();
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("serialised.ser"));
			out.writeObject(obj);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/// Deserialize
		SingletonDesignPatternSerialize obj2 = null;
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("serialised.ser"))) {
			try {
				obj2 = (SingletonDesignPatternSerialize) in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("obj1 :    " + obj.hashCode());
		System.out.println("obj2:  "+obj2.hashCode());
	}
}
