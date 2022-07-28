package builder;

public class Main {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildWall()
                           .buildFort()
                           .buildMine()
                           .build();
        /*
        * builder模式一般是构建复杂对象时需要
        * 比如有这样一个对象，它的属性非常多，而在实际使用这个对象时并不是所有属性都需要使用
        * 如果用构造器实例化对象，会往构造器中传入非常多的参数，并且不需要的参数都要传入表示为空的值，
        * 非常麻烦，这种情况下可以用builder模式
        * 见 Person类的示例
        * */
        Person p = new Person.PersonBuilder()
                .basicInfo(1,"xyz",27)
                .score(99)
                .weight(137)
                .loc("jr","23")
                .build();
    }
}
