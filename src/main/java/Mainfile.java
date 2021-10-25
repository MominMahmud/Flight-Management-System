import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Mainfile {

	@SuppressWarnings("resource")
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		flight []tempflight=new flight[11];
		Scanner readobj1=new Scanner(System.in);
		Scanner readobj2=new Scanner(System.in);
		Scanner readobj3=new Scanner(System.in);
		passenger []parr=new passenger[11];
		int countpassenger=0;
		System.out.println("Welcome!");
		System.out.println("Enter 1 for admin!");
		System.out.println("Enter 2 for passenger!");
		System.out.println("Enter 3 to exit");
		System.out.println("Enter option!");
		int switchoption=readobj2.nextInt();
		do {
			if(switchoption==1)
			{
				Admin tempadmin=new Admin();
				tempadmin.menu();
			}
			else if(switchoption==2)
			{
				System.out.println("Enter 1 to create an account!");
				System.out.println("Enter 2 to login!");
				int switchoption2=readobj2.nextInt();
				if(switchoption2==1)
				{
					String a,b,d,f,g;
					int c,e,h;
					System.out.println("Enter passenger name!");
					a=readobj1.next();
					System.out.println("Enter passenger gender!");
					b=readobj1.next();
					System.out.println("Enter passenger age!");
					c=readobj2.nextInt();
					System.out.println("Enter passenger address!");
					d=readobj1.next();
					System.out.println("Enter passenger passport number!");
					e=readobj2.nextInt();
					System.out.println("Enter passenger username!");
					f=readobj1.next();
					System.out.println("Enter passenger password!");
					g=readobj1.next();
					parr[countpassenger]=new passenger(a,b,c,d,e,f,g);
					parr[countpassenger].getdetails();
					countpassenger++;
					try {
						FileWriter myWriter = new FileWriter("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Momin_Project\\\\src\\\\main\\\\java\\\\infopassenger.txt");
						myWriter.write(a+","+b+","+c+","+d+","+e+","+f+","+g);
						System.out.println("Trying");
					    myWriter.close();
					}
					catch (IOException newe1) {
					      System.out.println("An error occurred with file!");
					 }
				}
				else if(switchoption2==2)
				{
					System.out.println("Enter your username!");
					String tempuser1=readobj1.next();
					System.out.println("Enter your password!");
					String temppass1=readobj1.next();
					int storeindex=0;
					boolean storevalue=false;
					for(int i=0;i<countpassenger;i++)
					{
						if(parr[i].getusername().equals(tempuser1) && parr[i].getpassword().equals(temppass1))
						{
							storeindex=i;
							storevalue=true;
							System.out.println("Found user!");
						}
						if(storevalue)
						{
							System.out.println("Logging in!");
							System.out.println("Enter 1 to search all flights!");
							System.out.println("Enter 2 to search flight!");
							int option3=readobj2.nextInt();
							if(option3==1)
							{
								String line;
								int counter=0;
								try {
									BufferedReader readFile=new BufferedReader(new FileReader("C:\\Users\\HP\\eclipse-workspace\\Momin_Project\\src\\main\\java\\flight.txt"));
									while((line=readFile.readLine())!=null) {
									if(counter==11)
										break;
									tempflight[counter]=new flight();
									String[] str=line.split(",");
									tempflight[counter].setorigin(str[0]);
									tempflight[counter].setdestination(str[1]);
									tempflight[counter].setflightid(Integer.parseInt(str[2]));
									tempflight[counter].setticketprice(Double.parseDouble(str[3]));
									tempflight[counter].setdate(str[4]);
									counter+=1;
									}
									readFile.close();
								}		
								catch (NullPointerException  e1) {
									System.out.println("Flights printed!");
								}
								for(int j=0;j<11;j++)
								{
									tempflight[j].getdetails();
								}
							}
							else if(option3==2)
							{

								System.out.println("Enter your origin!");
								String origin1=readobj1.next();
								System.out.println("Enter your destination!");
								String destination1=readobj1.next();
								String line;
								int counter=0;
								try {
									BufferedReader readFile=new BufferedReader(new FileReader("C:\\Users\\HP\\eclipse-workspace\\Momin_Project\\src\\main\\java\\flight.txt"));
									while((line=readFile.readLine())!=null) {
									if(counter==11)
										break;
									tempflight[counter]=new flight();
									String[] str=line.split(",");
									tempflight[counter].setorigin(str[0]);
									tempflight[counter].setdestination(str[1]);
									tempflight[counter].setflightid(Integer.parseInt(str[2]));
									tempflight[counter].setticketprice(Double.parseDouble(str[3]));
									tempflight[counter].setdate(str[4]);
									counter+=1;
									}
									readFile.close();
								}		
								catch (NullPointerException  e1) {
									System.out.println("Flights printed!");
								}
								for(int i1=0;i1<11;i1++)
								{
									if(tempflight[i1].getorigin().equals(origin1) && tempflight[i1].getdestination().equals(destination1))
									{
										tempflight[i1].getdetails();
									}
								}
							}
						}
						else
							System.out.println("Account not available!");
					}
				}
			}
			System.out.println("Enter option again from menu!");
			switchoption=readobj2.nextInt();
		}while(switchoption!=3);
		System.out.println("Bye Bye");
	}
	
}
