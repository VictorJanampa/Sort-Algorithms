class CountingSort {
  void sort(int arr[]) {
    int n = arr.length;
    int output[] = new int[n];
    int count[] = new int[10];
    for (int i = 0; i < n; ++i)
      count[i] = 0;

    for (int i = 0; i < n; ++i)
      ++count[arr[i]];
    for (int i = 1; i <= n; ++i)
      count[i] += count[i - 1];
    for (int i = n - 1; i >= 0; i--) {
      output[count[arr[i]] - 1] = arr[i];
      --count[arr[i]];
    }
    for (int i = 0; i < n; ++i)
      arr[i] = output[i];
  }
  void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
}

class Main {
  public static void main(String args[]) {
    CountingSort ob = new CountingSort();
    int arr[] = { 1, 2, 8};
    ob.sort(arr);

    System.out.println("Sorted array is ");
    ob.printArray(arr);
  }
}