import java.util.*;;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class Main
{ 
	public static void main(String[] args)
	{	
		int dey = vvidDay();
		int mounth = vvidMounth();
		int year = vvidYear();
		int [] matrixA;
                matrixA = new int [40];

		/* Insha versiy znahodjenny index day 
		Calendar cal = Calendar.getInstance();
		Date date = new Date(115,9,10);
		System.out.println(date.toString());
		cal.setTime(date);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);*/
		
		int dayOfWeek = znahoditDayOfWeek(dey, mounth, year);  

		Calendar calendar = new GregorianCalendar(year,mounth-1,dey);
		Calendar day_first_week = new GregorianCalendar(year,mounth-1,1);
		int dayOfFirstWeek = day_first_week.get(Calendar.DAY_OF_WEEK);
		int countDayInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	
		int countDay=1;
		if (dayOfFirstWeek==1)
		{
			dayOfFirstWeek=8;
		}
		
		while(countDay<=countDayInMonth)
		{
			matrixA [dayOfFirstWeek-2] = countDay;
			//count++;
			dayOfFirstWeek++;
			countDay++;
		}
		//System.out.println("1111");
		//System.out.println(dayOfFirstWeek);
	

		int counterVivoda = 0; 
		int countStrok = 5;
		//System.out.println(matrixLength);
	        calendar.set(year,mounth-1,countDayInMonth);
                calendar.add(Calendar.DAY_OF_MONTH,1);
                int indexDayOfNewMounth = calendar.get(Calendar.DAY_OF_WEEK);
               // System.out.println(counterVivoda);
        while (indexDayOfNewMounth!=2)
        {     
                int dayOfNewMounth = calendar.get(Calendar.DAY_OF_MONTH);
                matrixA [dayOfFirstWeek-2] = dayOfNewMounth;
                //System.out.println(dayOfNewMounth);
                dayOfFirstWeek++;
		//indexDayOfNewMounth++;
                //System.out.printf("%4d",matrixA[34]);
                //System.out.printf("%4d",matrixA[5]);
                calendar.add(Calendar.DAY_OF_MONTH,1);
                indexDayOfNewMounth = calendar.get(Calendar.DAY_OF_WEEK); 
         }
	



	for(int j=0;j<countStrok;j++)
	{
		for (int i=0;i<=6;i++)
		{
			System.out.printf("%4d",matrixA[counterVivoda]);
			counterVivoda++;
		}
		System.out.println();
	}

}

	public static int vvidDay()	
		{
                	System.out.println("Write day");
                	Scanner scan = new Scanner(System.in);  
			int dey = Integer.parseInt(scan.nextLine());
                	//System.out.println(dey);
			return dey;
		}
	public static int vvidMounth()
		{
			System.out.println("Write mounth");
			Scanner scan = new Scanner(System.in);
	                int mounth = Integer.parseInt(scan.nextLine());
			return mounth;
		}
	public static int vvidYear()
		{
			System.out.println("Write year");
			Scanner scan = new Scanner(System.in);
                	int year = Integer.parseInt(scan.nextLine());
			return year;
		}
                	/*System.out.println("Write mounth");
                	int mounth = Integer.parseInt(scan.nextLine());
                	//System.out.println(mounth);
                	System.out.println("Write year");
                	int year = Integer.parseInt(scan.nextLine());
                	//System.out.println(year);
                	//System.out.println(day+"."+mounth+"."+year);  
        		*/	        
	public static int znahoditDayOfWeek(int year, int mounth, int dey)
		{
			Calendar calendar = new GregorianCalendar(year,mounth-1,dey);
        		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			return dayOfWeek; 					
		}
		
}
