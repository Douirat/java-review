import java.util.*;

public class Main {
 public static void main(String[] args){
    Sorter sorter = new Sorter();
    sorter.add(new ArrayList<>(List.of(74,4,56,5,96,3,45,9,87,45)));
    sorter.insertionSort(0);
    sorter.display(0);
    sorter.add(new int[]{16,14,10,8,7,9,3,2,4,1});
    sorter.heapSort(0);
    sorter.displayList(0);
}
}