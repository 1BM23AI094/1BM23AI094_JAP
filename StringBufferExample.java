import java.util.*;

public class StringBufferExample { // Renamed class to avoid conflict
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        StringBuffer sb1 = new StringBuffer(sc.next());

        System.out.println("Capacity of StringBuffer object sb1: " + sb1.capacity());

        System.out.print("Enter second string: ");
        StringBuffer sb2 = new StringBuffer(sc.next());

        System.out.println("Capacity of StringBuffer object sb2: " + sb2.capacity());

        sb1.reverse();
        System.out.println("Reversed String is: " + sb1);

        String reversedUpperCase = sb1.toString().toUpperCase();
        System.out.println("Reversed String in uppercase: " + reversedUpperCase);

        sb1.append(sb2);
        System.out.println(sb1);
    }
}


//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=65361" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\Main.java\out\production\Main.java StringBufferExample
//Enter first string: madhu
//Capacity of StringBuffer object sb1: 21
//Enter second string: madhu
//Capacity of StringBuffer object sb2: 21
//Reversed String is: uhdam
//Reversed String in uppercase: UHDAM
//        uhdammadhu
//
//Process finished with exit code 0
