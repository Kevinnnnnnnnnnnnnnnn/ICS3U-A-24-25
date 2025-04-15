package day1;

public class Reptile extends Animal {
    /*
     * if you do not create a constructor, Java creates one for you
     * A default constructor will make a call to the parent constructor "super()"
     * 
     * implicit means Java did it for you
     * explicit means you did it yourself
     * 
     * public Reptile() {
     * super(); --> Animal();
     * }
     */

    private String species;
    private boolean isShedding;
    private String dietType;
    private String modeOfLocomotion;

    /*
     * public Reptile() {
     * // still not happy because it is trying to call super() and there is no
     * Animal() constructor
     * }
     */

    public Reptile(double mass, int age, boolean isAlive, boolean isHungry, String species, boolean isShedding,
            String dietType, String modeOfLocomotion) {
        super(mass, age, isAlive, isHungry);
        this.species = species;
        this.isShedding = isShedding;
        this.dietType = dietType;
        this.modeOfLocomotion = modeOfLocomotion;
    }

    public Reptile(double mass, String species, String dietType, String modeOfLocomotion) {
        super(mass);
        this.species = species;
        this.dietType = dietType;
        this.modeOfLocomotion = modeOfLocomotion;
        this.isShedding = false;
    }

}
