
import java.util.*;

public class Sorter {
    ArrayList<ArrayList<Integer>> arrays;
    int[][] lists;
    int size = 0;
    int i = 0;

    public Sorter() {
        arrays = new ArrayList<>();
        lists = new int[3][10];
    }

    public void add(ArrayList<Integer> arr) {
        this.arrays.add(arr);
        size++;
    }

    public void add(int[] arr) {
        this.lists[i] = arr;
        i++;
    }

    public void insertionSort(int index) {
        ArrayList<Integer> arr = arrays.get(index);
        for (int i = 1; i < arr.size(); i++) {
            int j = i - 1;
            int key = arr.get(i);
            while (j >= 0 && arr.get(j) >= key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }
    }

    public void heapSort(int index) {
        int[] arr = lists[index];
        for (int i = arr.length / 2; i <arr.length; i--) {
            maxHeapify(arr, i);
        }
    }

    private void maxHeapify(int[] A, int i) {
        int l = left(i);
        int r = right(i);

        System.out.println(String.format("left: %d - right: %d", l, r));
        int largest = i;
        if (l < A.length && A[l] > A[i])
            largest = l;

        if (r < A.length && A[r] > A[largest])
            largest = r;

        if (largest != i) {
            // A[i] = A[i] + A[largest];
            // A[largest] = A[i] - A[largest];
            // A[i] = A[i] - A[largest];
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A, largest);
        }
    }

    private int left(int i) {
        return (i * 2)+1;
    }

    private int right(int i) {
        return (i * 2) + 2;
    }

    // private int parent(int i){
    // return i/2;
    // }

    public void display(int index) {
        ArrayList<Integer> arr = this.arrays.get(index);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0)
                sb.append("{ ");
            sb.append(arr.get(i) + " ");
            if (i == arr.size() - 1)
                sb.append("}");
        }
        System.out.println(sb.toString());
    }

    public void displayList(int index) {
        int[] arr = this.lists[index];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                sb.append("{ ");
            sb.append(arr[i] + " ");
            if (i == arr.length - 1)
                sb.append("}");
        }
        System.out.println(sb.toString());
    }

}