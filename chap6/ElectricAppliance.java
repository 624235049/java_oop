package chap6;

public abstract class ElectricAppliance {
    public abstract void on();
    public abstract void off();
    public abstract void work();
}//

abstract class Fan1 extends ElectricAppliance{

    @Override
    public void on() {
        System.out.println("Fan : on()");
    }

    @Override
    public void off() {
        System.out.println("Fan : of()");
    }
    

}//
class Fan2 extends Fan1{

    @Override
    public void work() {
        System.out.println("Fan : work()");
    }
}