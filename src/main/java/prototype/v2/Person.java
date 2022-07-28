package prototype.v2;

//深克隆
/*
* 克隆模式的应用场景:
* 一个对象属性特别多，指定特别麻烦，同时有一个已经指定完了，
* 那么从它那直接克隆就会方便不少
* */
public class Person implements Cloneable{
    int age = 8;
    int score = 100;
    Location loc = new Location("bj",20);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
        p.loc = (Location)loc.clone();
        return p;
    }
}
class Location implements Cloneable{
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}