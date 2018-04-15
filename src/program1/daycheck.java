package program1;

//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
//import java.util.Date;
import java.util.Scanner;

public class daycheck 
{
public static void main (String args[])
{
	Scanner sc =new Scanner(System.in);
	
	int dd,mm,yy;
	
	System.out.println("Enter the date-");
	dd=sc.nextInt();
	System.out.println("Enter the month-");
	//mm=sc.nextInt()-1;
	mm=sc.nextInt();
	System.out.println("Enter the year-");
	yy=sc.nextInt();
	
	Date date=(new GregorianCalendar(yy,mm,dd)).getTime();
	SimpleDateFormat f= new SimpleDateFormat("EEEE");
	String dd1= f.format(dd);
	System.out.println(dd1);
	
	
}
}
