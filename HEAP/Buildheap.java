public class Buildheap {

    static void heapify(int arr[],int n,int i)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left] > arr[largest])
        {
            largest=left;
        }
        if(right<n && arr[right] > arr[largest])
        {
            largest=right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }

    }

    static void buildheap(int arr[],int n)
    {
        int lastheap=(n/2)-1;

        for(int i=lastheap;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }
    static void printHeap(int arr[], int n)
    {
        System.out.println("Array representation of Heap is:");
  
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 1, 3, 5, 4, 6, 13, 10,
            9, 8, 15, 17 };
        
        int n=arr.length;

        buildheap(arr,n);

        printHeap(arr, n);
    }
    
}
