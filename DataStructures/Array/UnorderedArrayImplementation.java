class UArray{
    int arr[];
    int size = 0;
    public UArray(int size)
    {
        this.arr = new int[size];
    }
    
    // to add a new element to its position
    public void add(int ele)
    {
        arr[size] = ele;
        size++;
    }

    // to get the current occupied size of an array
    public int getSize()
    {
        return size;
    }
    //To search a new element in an array.
    public int search(int ele)
    {
        for(int i = 0;i<size;i++)
        {
            if(arr[i] == ele)
            {
                return i;
            }
        }
        return -1;
    }
    //For adding a new element to a specified position
    public void insert(int idx, int ele)
    {
        if(idx<size)
        {
            for(int j = size-1;j>=idx;j--)
            {
                arr[j+1] = arr[j];
            }
            arr[idx] = ele;
            size++;
        }
        else
        {
            add(ele);
        }
    }

    //For Printing the array
    public void print()
    {
        System.out.print("[ ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

    //to delete an element at a specific position from a array
    public void delete(int idx)
    {
        int flag = 0;
        for(int i = 0;i<size;i++)
        {
            if(i == idx)
            {
                arr[i] = arr[i+1];
                flag = 1;
                // so that the next element i+1 will be situated at position i,
                // so position i will automatically delete.
            }
            if((flag == 1) && (i!=idx))
            {
                // so the new index which replaces idx element will also not be deleted,
                // that's why we check for i!=idx;
                arr[i] = arr[i+1];
            }
        }
        size--;
    }
}
public class UnorderedArrayImplementation {
    public static void main(String[] args) {
        UArray arr = new UArray(10);
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(0);
        arr.add(52);
        arr.print();
        int k =arr.search(52);
        System.out.println(k);
        arr.insert(2,6);
        arr.print();
        System.out.println(arr.getSize());
        arr.delete(5);
        arr.print();
        arr.add(6);
        arr.print();
        
    }
}
