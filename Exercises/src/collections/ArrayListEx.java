package collections;

import java.util.*;

class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  

public class ArrayListEx {
	public static void main(String args[]) {
		
		
		Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		  ArrayList<Student> sal = new ArrayList<Student>();
		  sal.add(s1);//adding Student class object  
		  sal.add(s2);  
		  sal.add(s3);  
		  
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		// Traversing list through Iterator
		Iterator itr = sal.iterator();

		list.remove("Ravi");
		/*
		 * 
		 */

		for (String str : list) {
			System.out.println(str);
		}
		
		while (itr.hasNext()) {
			Student st =(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
			}
	}

}