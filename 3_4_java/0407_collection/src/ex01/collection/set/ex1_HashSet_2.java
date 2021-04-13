package ex01.collection.set;

import java.util.*;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person)obj;			
			return name.equals(temp.name) && age == temp.age;
		}		
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
} // person end

public class ex1_HashSet_2 {	
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Person("aaa", 10));
		set.add(new Person("bbb", 20));
		set.add(new Person("ccc", 30));
		set.add(new Person("ddd", 40));
		set.add(new String("xxxxx\n"));
		set.add(new String("yyyyy\n"));
		
		System.out.println(set);
	}
}

	