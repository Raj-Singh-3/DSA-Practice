public class HeapImeplementation {
    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 6, 11};
        MaxHeap h = new MaxHeap(arr);
        // h.buildHeap();
        // h.printHeap();
        // h.increaseKey(4, 15);
        // h.printHeap();

        //   // System.out.println("removed element is: "+ h.extractMax());
        // h.decreaseKey(0, 4);
        // h.printHeap();
        // h.insert(18);
        // h.printHeap();
        h.printHeap();
        int res[] = h.heapSort();
        System.out.print("[");
        for(int i = 0;i<res.length;i++)
        {
            System.out.print(res[i]+ " ");
        }
        System.out.println("]");
        
    }
}
