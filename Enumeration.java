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
//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=64274" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\Enumeration\out\production\Enumeration Enumeration
//ISmonday a workday?true
//is Saturday a worday?false
//
//Process finished with exit code 0
