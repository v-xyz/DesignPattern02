package prototype.v1;
/*
* 一个类要实现克隆，要实现 Cloneable 接口并重写 clone方法
* 需要注意的是，clone方法本质是对象的内存复制一份，如果对象中有属性是引用类型，
* 那么 clone之后的对象和原来的对象都会指向该引用类型在堆中的同一块地址，这意味着
* 如果在原来的对象中修改该引用类型的值，克隆后的对象对应引用类型的值也会一起改变
* 于是该克隆也成为浅克隆
* */
public class Person implements Cloneable{
    int age = 8;
    int score = 100;
    Location loc = new Location("bj",20);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Location{
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
}
