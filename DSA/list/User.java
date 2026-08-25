public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    public User(int id, String firstName, String lastName, int age){
        this.id= id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString(){
        return String.format("  {\n  id: %d\n  first-name: %s\n  last-name: %s\n  age: %d\n  }\n", id, firstName, lastName, age);
    }
}