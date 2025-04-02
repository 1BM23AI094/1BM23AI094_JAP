import java.util.*;

class student{
    String name;
    int marks;
}

public class ExamScoreTracker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array: ");
        final int n = sc.nextInt();

        student obj[] = new student[n];

        for(int i = 0;i<n;i++){
            obj[i] = new student();

            System.out.println("Enter name and marks of student "+ (i+1) +" :");
            obj[i].name = sc.next();
            obj[i].marks = sc.nextInt();
        }

        int sum = 0;
        for(int i =0;i<n;i++){
            sum  = sum + obj[i].marks;
        }

        System.out.println("sum of scores of all students is " + sum);

        int maxScore = obj[0].marks;
        String maxMarks=obj[0].name;
        for(int i = 1;i<n;i++){
            if(obj[i].marks > maxScore){
                maxScore = obj[i].marks;
                maxMarks = obj[i].name;


            }
        }

        System.out.print("maximum score is " + maxScore + " is of the Student name : "+maxMarks);
    }
}
//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=64619" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\Enumeration\out\production\Enumeration ExamScoreTracker
//enter size of array: 5
//Enter name and marks of student 1 :
//MAdhu
//39
//Enter name and marks of student 2 :
//Aqueel
//89
//Enter name and marks of student 3 :
//nithin
//90
//Enter name and marks of student 4 :
//megharaj
//99
//Enter name and marks of student 5 :
//karthik
//100
//sum of scores of all students is 417
//maximum score is 100 is of the Student name : karthik
//Process finished with exit code 0
