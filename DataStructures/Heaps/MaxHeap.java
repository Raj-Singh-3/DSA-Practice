
// This Implementation will only be for MaxHeap

public  class MaxHeap{
    int heap[];
    int heapSize = 0;
    int capacity = 0;
    public MaxHeap(int arr[])
    {
        heap = arr;
        heapSize = arr.length;
        capacity = arr.length;
    }

    public void swap(int i , int j)
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void heapify(int index)
    {
        int largest = index;
        int leftChildIndex = 2*index+1;
        int rightChildIndex = 2*index+2;
        if(leftChildIndex < heapSize &&  heap[leftChildIndex] > heap[largest])
        {
            largest = leftChildIndex;
        }
        if(rightChildIndex < heapSize &&  heap[rightChildIndex] > heap[largest])
        {
            largest = rightChildIndex;
        }
        if(index!=largest)
        {
            swap(largest, index);
            heapify(largest);
        }
    }

    //This will build the heap from a given array.
    public void buildHeap()
    {
        int n = heapSize;
        // As we know the leaf nodes are from n/2 to n-1.
        // hence, we will call heapify from n/2-1 to 0.
        for(int i = n/2-1;i>=0;i--)
        {
            heapify(i);
        }
    }

    //This function will remove the maxelement from heap and return it.
    public int extractMax()
    {
        // If no element in the heap we will simply return -1.
        if(heapSize == 0)
        {
            return -1;
        }
        int val = heap[0];
        // either we can swap (index 0 and index heapsize-1 ) or we can put heap[0] = heap[heapsize-1].
        swap(0,heapSize-1); 
        heapSize--;
        heapify(0);
        return val;
    }


    // This function is used when we have to increase the value of one of the element from heap.
    public void increaseKey(int index , int newvalue)
    {
        if(index<0 || index>=heapSize || heap[index]>=newvalue)
        {
            System.out.println("Element can't be updated");
            return;
        }
        heap[index] = newvalue;
        // using the below formula , we can calculate the parentIndex of an Index.
        int parentIndex = (int)(Math.ceil(index/2.0)-1);
        while(index>0 && heap[index]>heap[parentIndex])
        {
            swap(index,parentIndex);
            index = parentIndex;
        }
    }

    // This function is used when we have to decrease the value of one of the element from heap.
    public void decreaseKey(int index , int newvalue)
    {
        if(index<0 || index>=heapSize || heap[index]<=newvalue)
        {
            System.out.println("Element can't be updated");
            return;
        }
        heap[index] = newvalue;
        heapify(index);
        
    }

    // This method is used to increase the size of the capacity of the heap array.
    public void increaseCapacity()
    {
        capacity *= 2;
        int newHeap[] = new int[capacity];
        for(int i = 0;i<heapSize;i++)
        {
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    // this method is used to insert a new element in the heap.
    public void insert(int element)
    {
        if(heapSize>=capacity)
        {
            increaseCapacity();
        }
        heapSize += 1;
        heap[heapSize-1] = element;
        int index = heapSize-1;
        // using the below formula , we can calculate the parentIndex of an Index.
        int parentIndex = (index - 1) / 2;
        while(index>0 && heap[index]>heap[parentIndex])
        {
            swap(index,parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }

    }


    public int[] heapSort()
    {
        buildHeap();
        int size = heapSize;
        for(int i = 0;i<size;i++)
        {
            extractMax();
        }
        return heap;
    }

    // This function will just print the heap.
    public void printHeap()
    {
        System.out.print("[");
        for(int i = 0;i<heapSize;i++)
        {
            System.out.print(heap[i]+" ");
        }
        System.out.println("]");
    }

    
}
