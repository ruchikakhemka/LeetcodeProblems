import java.util.Scanner;

public class MyStack {

    private int top;
    private int defaultarraySize = 10;
    private int[] array = null;
    MyStack()
    {
        top = -1;
        array = new int[defaultarraySize];

    }
    //push method will add an element into the stack
    public void push(int num)
    {
        //check for overflow condition
        if(top == defaultarraySize-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else
        {
            array[++top] = num;
        }
    }
    //pop method will remove element from stack;
    public void pop()
    {
        //check for underflow condition
        if(top == -1)
        {
            System.out.println("Stack underflow");
            return;
        }
        else
        {

            System.out.println("Popped out:"+array[top]);
            top--;
        }
    }
    //Peek method will return the top element from stack
    public int peek()
    {
        return array[top];
    }
    //isEmpty will check whether the stack is empty or not
    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        else
            return  false;
    }
    public int stackSize()
    {
        return top+1;
    }
    public static void main(String[] args)
    {
        MyStack st = new MyStack();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Stack operation");
        System.out.print("1. Push, " +"\n"+ "2. Pop"+"\n"+"3. Peek"+"\n"+"4. StackSize");

        String answer = "Y";
        while (answer == "Y" || answer == "y") {
            String choice = scan.next().toLowerCase();
            switch (choice) {
                case "push":
                    int num = scan.nextInt();
                    st.push(num);
                    break;
                case "pop":
                    st.pop();
                    break;
                case "peek":
                    System.out.println("Top element of stack is :" + st.peek());
                    break;

                case "stacksize":
                    System.out.println("No of elements in stack is" + st.stackSize());
                    break;
                default:
                    System.out.println("Not a valid choice");
                    break;
            }
            System.out.println("Do you want to carry out more stack operations");
            answer = scan.next();
        }

    }

}
