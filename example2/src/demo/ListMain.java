package demo;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import sample.employee;



public class ListMain {

	public static void main(String[] args) {
		List<employee> employeelist = new ArrayList<employee>();
		employee emp1 = new employee("Ram","Banglore",9000.0);
		employeelist.add(emp1);
		employeelist.add(new employee("Jyothi","ballari",9898.0));
		employeelist.add(new employee("Sahana","mysore",9098.0));
		employeelist.add(new employee("aruna","bihar",8999.0));
		employeelist.add(new employee("shilpa","bangladesh",9292.0));
		
		Iterator<employee> it =(Iterator<employee>) new employeelist.iterator();;
		while(it.hasNext()) {
			employee emp =it.next();
			System.out.println(emp);
		}
                 System.out.println(".........................................");
                  for(emplyoee employ:employeelist)
                        System.out.println(employ);
		
		System.out.println("---------------reverse order-------------");
		ListIterator<employee> listit = (ListIterator<employee>) new employeelist.Listiterator();
		while(listit.hasPrevious()) {
			employee employ =listit.previous();
			System.out.println(employ);
		}
		
		
		
		
		
		
		
		

	}

}
