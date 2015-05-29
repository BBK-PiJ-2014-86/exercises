package day19;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

import ContactManager.FutureMeeting;
import ContactManager.FutureMeetingImpl;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kalc pap = () -> System.out.println("AA");
		
		System.out.println("\"The trouble with having an open mind, of course, is that people will insist on coming along and trying to put things in it.\" Terry Pratchett");
		
		List <Cat> p = new ArrayList();
		
		Calendar date1 = Calendar.getInstance(); date1.set(2011, 2, 2, 2, 2);
		Calendar date2 = Calendar.getInstance(); date2.set(2011, 2, 2, 2, 1);
		Calendar date3 = Calendar.getInstance(); date3.set(2011, 2, 1, 2, 1);
		
		p.add(new Cat("Red",date1));
		p.add(new Cat("Blue", date2));
		p.add(new Cat("Brown",date3));
		
		for (Cat a: p) {
			System.out.println(a.colour);
		}
		
		p.sort(Comparator.comparing(c -> c.birth));
		
		for (Cat a: p) {
			System.out.println(a.colour);
		}
		
		
	}

}
