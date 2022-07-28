package TemplateMethod;
abstract class F {
    public void m(){
        m1();
        m2();
    }
    abstract void m1();
    abstract void m2();
}
class C1  extends F{
    @Override
    void m1() {
        System.out.println("m1");
    }

    @Override
    void m2() {
        System.out.println("m2");
    }
}
