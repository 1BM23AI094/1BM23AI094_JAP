

interface Stack1 {
    void push(int data);

    int pop();

    int peek();

    boolean isEmpty();
}


class FixedLengthStack implements Stack1 {
    private int[] arr;
    private int top;
    private int capacity;

    FixedLengthStack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        top += 1;
        arr[top] = data;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int head = arr[top];
        top -= 1;
        return head;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}

public class Demo {
    public static void main(String[] args) {

        System.out.println("Fixed Length Stack implementation: ");
        Stack1 s = new FixedLengthStack(5);
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


//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=50322" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Admin\IdeaProjects\LAB 6_8\out\production\LAB 6_8" Demo
//Fixed Length Stack implementation:
//        40
//        30
//        20
//        10
//
//Process finished with exit code 0