import java.util.*;

public class Main {
 public static void main(String[] args){
    Sorter sorter = new Sorter();
    sorter.add(new ArrayList<>(List.of(74,4,56,5,96,3,45,9,87,45)));
    sorter.insertionSort(0);
    sorter.display(0);
}
}