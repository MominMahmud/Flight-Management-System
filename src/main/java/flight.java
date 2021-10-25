public class flight {

	private String origin;
	private String destination;
	private int countofpassenger;
	private int flightid;
	private double ticketprice;
	private String date;
	
	flight()
	{
		origin="";
		destination="";
		countofpassenger=0;
		flightid=0;
		ticketprice=100.0;
		date="25-10-2021";
	}
	flight(String a,String b,int c,int d,String e)
	{
		origin=a;
		destination=b;
		countofpassenger=0;
		flightid=d;
		ticketprice=100.0;
		date=e;
	}
	void setorigin(String a)
	{
		origin=a;
	}
	void setdestination(String a)
	{
		destination=a;
	}
	void setflightid(int a)
	{
		flightid=a;
	}
	void setticketprice(double a)
	{
		ticketprice=a;
	}
	void setdate(String a)
	{
		date=a;
	}
	String getorigin()
	{
		return origin;
	}
	String getdestination()
	{
		return destination;
	}
	double getticketprice()
	{
		return ticketprice;
	}
	public void insertflightdetails(String a,String b,int c,Double d,String e) throws ticketpricevalidation
	{
		if(ticketprice<0.0)
			throw new ticketpricevalidation("Invalid price entered!");
		origin=a;
		destination=b;
		countofpassenger=0;
		flightid=c;
		ticketprice=d;
		date=e;	
	}
	void getdetails()
	{
		System.out.println("The flight origin:"+origin);
		System.out.println("The flight destination:"+destination);
		System.out.println("The flight passenger count:"+countofpassenger);
		System.out.println("The flight id:"+flightid);
		System.out.println("The flight price:"+ticketprice);
		System.out.println("The flight date:"+date);
	}
	
}
