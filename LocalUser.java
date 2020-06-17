

public class LocalUser implements User {
    public String name;
    public int age;

    public LocalUser(String name, int age){
        this.name = name;
        this.age = age;
    }

    public User getUser(){
        return this;
    }

    public String getName(){
        return "["+this.name+"]";
    }

    public void updateName(String name){
        this.name = name;
    }
}
