
import java.util.*;

public class Sorter {
    ArrayList<ArrayList<Integer>> arrays;
    int size = 0;
public Sorter(){
    arrays = new ArrayList<>();
}

public void add(ArrayList<Integer> arr){
    this.arrays.add(arr);
    size++;
}

public void insertionSort(int index){
    ArrayList<Integer> arr = arrays.get(index);
    for(int i=1; i<arr.size(); i++){
        int j = i-1;
        int key = arr.get(i);
        while(j>=0 && arr.get(j) >= key){
            arr.set(j+1, arr.get(j));
            j--;
        }
        arr.set(j+1, key);
    }
}

public void display(int index){
    ArrayList<Integer> arr = this.arrays.get(index);
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<arr.size(); i++){
        if(i==0) sb.append("{ ");
        sb.append(arr.get(i) + " ");
        if(i==arr.size()-1) sb.append("}");
    }
    System.out.println(sb.toString());
}

}