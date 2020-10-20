
package java;
import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListMain listmain1 = new ListMain("Jyothi","Banglore",101);
ListMain listmain2 = new ListMain("Sahana","Mysore",100);
ListMain listmain3 = new ListMain("Aruna","Ballari",102);
ListMain listmain4 = new ListMain("Shilpa","Banglore",105);

ArrayList<ListMain> totallist = new ArrayList<ListMain>();

totallist.add(listmain1);
totallist.add(listmain2);
totallist.add(listmain3);
totallist.add(listmain4);

for(ListMain l:totallist) {
	System.out.println(l);
}

Collections.sort(totallist);
System.out.println("After sorting");
for(ListMain l:totallist) {
	System.out.println(l);
}




	}

}
