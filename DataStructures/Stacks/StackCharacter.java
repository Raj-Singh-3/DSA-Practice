public class StackCharacter
{
    char stack[];
    int top = -1; 
    int maxSize;
    public StackCharacter(int size)
    {
        this.stack = new char[size];
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

    public void push(char ele)
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

    public char pop()
    {
        if(!isEmpty())
        {
            return stack[top--];
        }
        else
        {
            System.out.println("Stack is already empty");
            return '\0';
        }
    }


    public char peek()
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

