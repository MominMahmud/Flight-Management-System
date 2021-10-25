import java.io.FileWriter;
import java.io.IOException;
public class passenger {

	private String name;
	private String gender;
	private int age;
	private String address;
	private int passport_number;
	private String username;
	private String password;

	passenger()
	{
	name="";
	gender="";
	age=0;
	address="";
	passport_number=0;
	username="";
	password="";
	}
	passenger(String a,String b,int c,String d,int e,String f,String g)
	{
	name=a;
	gender=b;
	age=c;
	address=d;
	passport_number=e;
	username=f;
	password=g;
	}
	public String getusername()
	{
	return username;
	}
	public String getpassword()
	{
	return password;
	}
	public void insert_Passenger_Details(String a,String b,int c,String d,int e,String f,String g,int h)
	{
	name=a;
	gender=b;
	age=c;
	address=d;
	passport_number=e;
	username=f;
	password=g;
	System.out.println("Passenger details added successfully!");
	}
	public void getdetails()
	{
	System.out.println("Name: "+name);
	System.out.println("Gender: "+gender);
	System.out.println("Age: "+age);
	System.out.println("Address: "+address);
	System.out.println("Passport number: "+passport_number);
	System.out.println("Username: "+username);
	System.out.println("Password: "+password);
	}
	public void writeToFile() throws IOException {
	FileWriter Fwriter=new FileWriter("Passengers.txt",true);
	Fwriter.write(name+","+gender+","+address+","+age+","+username+","+password+","+passport_number+"\n");
	Fwriter.close();
	}
}
