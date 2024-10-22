package day8;

public class TestQuestionTwoB {
    public static void main(String[] args) {
        Member john = new Member("John Doe", 101);
        Trainer sarah = new Trainer("Sarah Lee", 5);
        WorkoutPlan strengthTraining = sarah.createWorkoutPlan("Strength Training");

        sarah.assignWorkoutPlan(john, strengthTraining);

        WorkoutPlan johnsPlan = john.getWorkoutPLan();
        System.out.println(johnsPlan.getPlanName() + " " + johnsPlan.getDifficulty());

        john.cancelWorkoutPlan();
        WorkoutPlan cardioEndurance = new WorkoutPlan("Cardio Endurance", "easy");
        sarah.assignWorkoutPlan(john, cardioEndurance);
        johnsPlan = john.getWorkoutPLan();
        System.out.println(johnsPlan.getPlanName() + " " + johnsPlan.getDifficulty());
        
        WorkoutPlan yogaFlexibility = sarah.createWorkoutPlan("Yoga Flexibility");
        john.changeWorkoutPlan(yogaFlexibility);
        johnsPlan = john.getWorkoutPlan();
        System.out.println(johnsPlan.getPlanName() + " " + johnsPlan.getDifficulty());
    }
}
