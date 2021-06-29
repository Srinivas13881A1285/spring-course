package practise;

public interface UtilMethods {

    void add();

    void sub();

    void mul();

    void div();
}

class Calculator implements UtilMethods{

    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    @Override
    public void mul() {

    }

    @Override
    public void div() {

    }
}
interface my{

}
class A implements my{

}

class B extends A{

}
class Test{
    public static void main(String[] args) {
        UtilMethods utilMethods = new Calculator();

        //intefrace can hold its impl class obj

        B b = new B()   ;

        A a = new B();
        //super class cn hold its child class obj

        my m = new B();
        //intefrace can hold its impl class obj

    }
}

