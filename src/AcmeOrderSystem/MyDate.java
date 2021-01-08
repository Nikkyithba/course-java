package AcmeOrderSystem;

public class MyDate {

    public int day;
    public int month;
    public int year;

    public MyDate() {};
    public MyDate( int d,int m, int y){
        day=d;
        month=m;
        year=y;
    }

    public String toString(){
        return (month+ "/" + day + "/" + year);
     }

    public void setDate(int sDay, int sMonth, int sYear){
        day = sDay;
        month = sMonth;
        year = sYear;

    }

    {
        day=1;
        month=1;
        year=2000;

    }

}
