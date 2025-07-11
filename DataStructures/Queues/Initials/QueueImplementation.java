// this implementation would be for Circular queue using an array
class QueueX{
    int maxSize;
    int arr[];
    int rear;
    int front;
    int size = 0;
    public QueueX(int s)
    {
        maxSize = s;
        arr = new int[s];
        rear = -1;
        front = 0;
    }
    public boolean isFull()
    {
        if(size == maxSize)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        return false;
    }

    public void enque(int ele)
    {
        if(!isFull())
        {
            arr[++rear%maxSize] = ele;
            size++;
        }
        else
        {
            System.out.println("Queue is full");
        }
    }

    public int deque()
    {
        if(!isEmpty())
        {
            int x = arr[front++];
            front = front%maxSize;
            size--;
            return x;
        }
        return -1;
    }
    public int peek()
    {
        return arr[front];
    }
}
public class QueueImplementation{
    public static void main(String[] args) {
        QueueX  que = new QueueX(5);
        System.out.println(que.isEmpty());
        que.enque(2);
        que.enque(8);
        que.enque(7);
        que.enque(6);
        que.enque(1);
        System.out.println(que.isFull());
        que.deque();
        que.deque();
        que.enque(3);
        que.enque(9);
        for (int i = 0; i < 5; i++) {
            System.out.println(que.deque());
        }
        System.out.println(que.isEmpty());

    }
}