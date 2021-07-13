package HW1;

public class Human implements Minions {
     private int endurance = 1000;
     float heightjump = 1.5f;
    private String name = "Олег";

    void run(int endurance) {
        this.endurance=endurance;
        System.out.println("Человек бежит " + getEndurance() + " метров");
    }
    String getName() {
        return name;
    }
    int getEndurance() {
        return endurance;
    }
    /*void setEndurance(int endurance) {
        this.endurance=endurance;
    }*/
    boolean checkRun(int endurance, int distance) {
        return (endurance > distance);
    }

    void jump() {
        System.out.println("\nЧеловек прыгает  " + getHeightjump() + " метр(а/ов)");
    }
    float getHeightjump() {
        return heightjump;
    }

    /*public void setHeightjump(float heightjump) {
        this.heightjump = heightjump;
    }*/

    boolean checkJump(float heightjump, int height) {
        return (heightjump>height);
    }
}
