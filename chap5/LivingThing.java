package chap5;

public class LivingThing {

    protected String name;

    public void grow() {
        System.out.println("grow()");
    }

    public void reproduce() {
        System.out.println("reproduce()");
    }
}//end class

class Plant extends LivingThing {
}

class Animal extends LivingThing {

    private String color;
    protected int leg;

    public void move() {
        System.out.println("move()");
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

}//end class Animal

class Dog extends Animal {

    protected int leg;

    public void bark() {
        System.out.println("bark()");
    }

    @Override
    public void move() {
        System.out.println("Dog move so fast.");
    }

}//end class Dog

