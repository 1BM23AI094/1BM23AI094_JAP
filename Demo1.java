import java.util.ArrayList;

interface Stack {
    void push(int data);
    int pop();
    int peek();
    boolean isEmpty();
}

class DynamicLengthStack implements Stack {
    private ArrayList<Integer> arr;

    DynamicLengthStack() {
        arr = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public void push(int data) {
        arr.add(data);
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr.remove(arr.size() - 1);
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr.get(arr.size() - 1);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Dynamic Length Stack implementation: ");
        Stack s = new DynamicLengthStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

//
//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=50393" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Admin\IdeaProjects\LAB 6_8\out\production\LAB 6_8" Demo1
//Dynamic Length Stack implementation:
//        40
//        30
//        20
//        10
//
//Process finished with exit code 0