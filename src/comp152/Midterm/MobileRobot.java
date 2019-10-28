package comp152.Midterm;

import java.util.Scanner;

public class MobileRobot extends Robot implements DemoMode {

    private String LocomotionType;
    private String name;

    public MobileRobot(String RobotName, String type){
        super(450);
        name = RobotName;
        LocomotionType = type;
    }

    public void move(float distance){
        System.out.println("Moving robot " + distance);
        powerLevel = powerLevel - ((int)distance/5);
    }

    public void interacteWithWorld(){
        System.out.println("How far would you like to move? (in feet)");
        Scanner reader = new Scanner(System.in);
        var distance = reader.nextInt();
        move(distance);
    }

    public void performDemo(){
        recharge(powerLevel);
        interacteWithWorld();
    }

    public void move() {
        var distance = 10f;
        System.out.println("Robot moved " + distance );
        powerLevel = powerLevel - ((int)distance/5);
    }

    public void MobileRobot(){
        String LocomotionType = "walking";
        String name = "Person";

    }
}
