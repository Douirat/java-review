public class Main {
public static void main(String[] args){
    SingleLinkedList<User> list = new SingleLinkedList<>();
    list.addFirst(new User(1, "Bennacer", "Douirat", 34));
    list.addFirst(new User(2, "Nora", "Abid", 23));
    list.addFirst(new User(3, "tester", "test", 30));
    list.display();
    System.err.println("   -----------------------------------------------");
    list.deleteById(2);
    list.display();
}
}