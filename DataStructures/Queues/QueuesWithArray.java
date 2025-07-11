class QueueArray{
    int arr[];
    int start = -1;
    int end = -1;
    int size = 0;
    int currentSize = 0;
    public QueueArray(int s)
    {
        this.size = s;
        this.arr = new int[size];
    }
    public void push(int ele)
    {
        if(this.start == -1 && this.end == -1)
        {
            this.start = 0;
            this.end = 0;
            this.arr[this.end] = ele;
        }
        else if(this.currentSize == this.size)
        {
            System.out.println("Queue is full");
            return;
        }
        else{
            this.end = (this.end+1)%this.size;
            this.arr[this.end] = ele;
        }
        this.currentSize += 1;
    }


    public int pop()
    {
        if(this.start == -1 && this.end == -1)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            this.currentSize -= 1;
            int val = this.arr[this.start];
            this.start = (this.start+1)%this.size;
            return val;
        }
    }

    public int top()
    {
        if(this.start == -1 && this.end == -1)
        {
            return -1;
        }
        else
        {
            return this.arr[this.start];
        }
    }


    public int size()
    {
        return this.currentSize;
    }

    public void print()
    {
        System.out.print("[ ");
        for(int i = this.start;i<this.end;i++)
        {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println("]");
    }
}
public class QueuesWithArray {
    public static void main(String[] args) {
        
    }
}
