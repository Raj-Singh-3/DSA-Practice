class OArray{
    int arr[];
    int size = 0;
    public OArray(int size)
    {
        this.arr = new int[size];
    }

     // to get the current occupied size of an array
     public int getSize()
     {
        return size;
     }


    public int search(int ele)
    {
        int low = 0;
        int high = size;
        while(low<=high)
        {
            int mid = (high+low)/2;
            if(arr[mid] == ele)
            {
                return mid;
            }
            else if(arr[mid]>ele)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    //it will add a new element in such a way that the array will be sorted.
    public void add(int ele)
    {
        if(size == 0)
        {
            arr[size] = ele;
        }
        else
        {
            int i = 0;
            for(i = 0;i<size;i++)
            {
                if(arr[i]>ele)
                {
                    break;
                }
            }
            for(int j = size;j>i;j--)
            {
                arr[j] = arr[j-1];
            }
            arr[i] = ele;
        }
        size++;
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
}
public class OrderedArrayImplementation {
    public static void main(String[] args) {
        OArray arr = new OArray(10);
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.print();
        int k = arr.getSize();
        System.out.println(k);
        int d = arr.search(0);
        System.out.println(d);


    }
}
