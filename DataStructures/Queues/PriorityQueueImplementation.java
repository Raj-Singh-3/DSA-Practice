class PriorityQ{
    int arr[];
    int maxSize;
    int size;
    public PriorityQ(int s)
    {
        maxSize = s;
        arr = new int[s];
        size = 0;
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

    public void insert(int ele)
    {
        // 50 40 30 20 10
        // in this way the elements will be stored in the array.
        // and they will be deleted like this
        //50 40 30 20
        //50 40 30
        //50 40
        //50 
        if(!isFull())
        {
            if(size == 0)
            {
                arr[size++] = ele;
            }
            else
            {
                int j;
                for(j = size-1;j>=0;j--)
                {
                    if(ele>arr[j])
                    {
                        arr[j+1] = arr[j];
                    }
                    else
                    {
                        break;
                    }
                }
                arr[j+1] = ele;
                size++;
            }
        }
    }
    public void print()
    {
        System.out.print("[ ");
        for(int i = 0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

    }


    public int peek()
    {
        return arr[size-1];
    }


    public int delete()
    {
        return arr[--size];
    }
}

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQ pq = new PriorityQ(10);
        System.out.println(pq.isFull());
        System.out.println(pq.isEmpty());
        pq.insert(9);
        pq.insert(6);
        pq.insert(8);
        pq.insert(28);
        pq.insert(0);
        pq.insert(5);
        pq.insert(11);
        pq.insert(3);
        pq.print();
        System.out.println(pq.isFull());
        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
        pq.delete();
        pq.delete();
        pq.delete();
        pq.delete();
        pq.delete();
        pq.print();
    
    }
}
