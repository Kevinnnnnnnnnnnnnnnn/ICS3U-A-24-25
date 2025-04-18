package day1;

public class Animal {
    private double mass;
    private int age;
    private boolean isAlive;
    private boolean isHungry;

    public Animal (double mass, int age, boolean isAlive, boolean isHungry) {
        this.mass = mass;
        this.age = age;
        this.isAlive = isAlive;
        this.isHungry = isHungry;
    }

    public Animal (double mass) {
        this.mass = mass;
        this.age = 0;
        this.isAlive = true;
        this.isHungry = true;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Boolean getIsHungry() {
        return isHungry;
    }

    public void setIsHungry(Boolean isHungry) {
        this.isHungry = isHungry;
    }
    
    public void eat() {
        isHungry = false;
        mass++;
    }
}
