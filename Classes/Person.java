package Classes;

public abstract class Person {

    String name, contact, status;
    int id;

    static int id1 = 0;
    public Person(String name, String contact) {
        this.name = name;
        this.id = id1;
        id1++;
        this.contact = contact;
        this.status = "Active";
    }

    public abstract void show();

    public abstract void add();

    public abstract void remove();
}
