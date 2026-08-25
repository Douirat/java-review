public class Main {
public static void main(String[] args){
    SingleLinkedList<User> list = new SingleLinkedList<>();
    list.addFirst(new User(2, "Bennacer", "Douirat", 34));
    list.addFirst(new User(1, "Nora", "Abid", 23));
    list.addLast(new User(3, "tester", "test", 30));
    list.display();
}
}