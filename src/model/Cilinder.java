package model;

public class Cilinder extends AbstractForm {
    private float length;
    private float diameter;

    public Cilinder(Wood wood, float length, float diameter) {
        super(wood);
        this.length = length;
        this.diameter = diameter;
    }


    public float getLength() {
        return length;
    }

    public float getDiametr() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Cilinder:  wood - " + wood +
                ", weight - " + weight() +
                ", volume - " + volume();
    }

    @Override
    public float volume() {
        return (float) (Math.PI * Math.pow(diameter/2, 2) * length);
    }

}
