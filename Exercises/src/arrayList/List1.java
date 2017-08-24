package arrayList;

import java.util.ArrayList;

class demoList {	
	ArrayList<String> demoList = new ArrayList<String>();
	
    public void addGroc(String item) {
    	
    	demoList.add(item);
	  
   }
    
    public void print() {
    
    	System.out.println("you have "+demoList.size() +"items in your list");
       for(int i=0;i<demoList.size();i++) {
    	   System.out.println("(i");
       }
    
    }
	
}

public class List1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

	list.add("hello");
	list.add("World");
	System.out.println("details "+list);
		
		
	}

}
