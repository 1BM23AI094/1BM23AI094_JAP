 public class Strings {
    public static void main(String[] args){
        System.out.println("checking two strings are equal are not :");
        String S1="hello";
        String S2="Hello";
        System.out.println("result of two strings comparings is :"+S1.equals(S2));
        System.out.println("copying the string: ");
        String Str="Aqueel";
        String Str1=new String(Str);
        System.out.println("original string str:"+Str + "  Copied string Str1 is :"+Str1);
        System.out.println("concatenation of two strings:");
        String T="hello";
        String T2=" megharaj";
        System.out.println("concatination of two stgraings:"+T.concat(T2));


    }
}

//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=65371" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\Main.java\out\production\Main.java Strings
// checking two strings are equal are not :
// result of two strings comparings is :false
// copying the string:
// original string str:Aqueel  Copied string Str1 is :Aqueel
// concatenation of two strings:
// concatination of two stgraings:hello megharaj
//
// Process finished with exit code 0