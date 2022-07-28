package prototype.v1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();

        System.out.println(p2.age + " " + p2.score);
        System.out.println(p2.loc);

        System.out.println(p1.loc == p2.loc); //true
        p1.loc.street = "sh";
        System.out.println(p2.loc);  //sh
    }
}
