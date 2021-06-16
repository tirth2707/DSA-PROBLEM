void heapify(int arr[], int n, int i) {
    // Find largest among root, left child and right child
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

// Main function to do heap sort
void buildHeap(int arr[], int n) {
    // Build max heap
    
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    
}