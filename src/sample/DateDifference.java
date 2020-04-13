package sample;

import java.util.Calendar;
import java.util.Date;

public class DateDifference {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
		Date d=new Date();
		
		
		System.out.print(d);
		
		Date d2=new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d2);
		c.add(Calendar.MONTH, 2);
		d2=c.getTime();
		System.out.println(d2);
		long x=0;
		if(d.after(d2))
		{
		x=d.getTime()-d2.getTime();
		
		
		}
		else if(d2.after(d))
		{
			x=d2.getTime()-d.getTime();
		}
		Calendar c1=Calendar.getInstance();
		c1.setTimeInMillis(x);
		Date d3=c1.getTime();
		System.out.println(d3);
	}

}
