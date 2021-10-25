public class date {

	int day;
    int month;
    int year;

    date(){
    	day=0;
    	month=0;
    	year=0;
    }

    date(int d, int m, int y) throws datevalidationException{
    	if(d<0 || m<0 || y<0)
    	{
    		throw new datevalidationException("Invalid date");
    	}
        day = d;
        month = m;
        year = y;
    }

    public void setDay(int d){
        day = d;
    }

    public void setMonth(int m){
        month = m;
    }

    public void setYear(int y){
        year = y;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void displayDate(){
        System.out.println(day + "-" + month + "-" + year);
    }
	
}
