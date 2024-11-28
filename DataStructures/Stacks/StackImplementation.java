class StackX
{
    int stack[];
    int top = -1; 
    int maxSize;
    public StackX(int size)
    {
        this.stack = new int[size];
        this.maxSize = size;
    }

    public boolean isFull()
    {
        if(top == maxSize-1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        return false;
    }

    public void push(int ele)
    {
        if(!isFull())
        {
            stack[++top] = ele;
        }
        else
        {
            System.out.println("Stack is already Full");
        }
    }

    public int pop()
    {
        if(!isEmpty())
        {
            return stack[top--];
        }
        else
        {
            System.out.println("Stack is already empty");
            return -1;
        }
    }


    public int peek()
    {
        return stack[top];
    }


    public void print()
    {
        System.out.print("[ ");
        for(int i = 0;i<=top;i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println("]");
    }
}


public class StackImplementation {

    public static void main(String[] args) {
        StackX st = new StackX(10);
        st.push(1);
        st.push(9);
        st.push(8);
        st.push(4);
        st.push(5);
        st.push(3);
        st.print();
        st.pop();
        st.print();
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
    }
}
