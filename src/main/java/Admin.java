import java.util.Scanner;

public class Admin {

	private String name;
	Scanner readobj1=new Scanner(System.in);
	Scanner readobj2=new Scanner(System.in);
	Scanner readobj3=new Scanner(System.in);

	Admin()
	{
		name="";
	}
	Admin(String n)
	{
		name=n;
	}
	void setName(String n) 
	{
		name=n;
	}
	void menu()
	{
		int choice;
		System.out.print("You are an authenticated Admin!"+name+"\n");
		System.out.print("press 1 to add a flight!\n");
		choice=readobj2.nextInt();
		if (choice==1) {
			AddFlight();
		}
	}

	@SuppressWarnings("unused")
	void AddFlight() 
	{
		System.out.println("Enter the origin");
		String temp1=readobj1.next();
		System.out.println("Enter the destination");
		String temp2=readobj1.next();
		System.out.println("Enter the passenger count");
		int temp3=readobj2.nextInt();
		System.out.println("Enter the flight id");
		int temp4=readobj2.nextInt();
		System.out.println("Enter the ticket price");
		Double temp5=readobj3.nextDouble();
		System.out.println("Enter the flight date");
		String temp6=readobj1.next();
		flight newobj=new flight();
		try {
			newobj.insertflightdetails(temp1, temp2, temp4, temp5, temp6);
		} catch (ticketpricevalidation e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Added flight successfully!");
	}
	
}
