import java.util.*;

public class Enumeration{
    public enum DayofWeek {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;

        public  boolean isWorkday(){
            return(this!=Saturday&&this!=Sunday);
        }
    }
    public static void main(String[] args){
        System.out.println("ISmonday a workday?"+ Enumeration.DayofWeek.Monday.isWorkday());
        System.out.println("is Saturday a worday?"+Enumeration.DayofWeek.Saturday.isWorkday());

    }
}