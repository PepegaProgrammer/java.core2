package HW1;

public class Cat implements Minions {
    private int endurance = 100;
    float heightjump = 1f;
    private String name = "Абобик";

    void run(int endurance) {
        this.endurance=endurance;
        System.out.println("\nКот бежит " + getEndurance() + " метров");
    }
    int getEndurance() {
        return endurance;
    }
    String getName() {
        return name;
    }
    void setEndurance(int endurance) {
        this.endurance=endurance;
    }
    boolean checkRun(int endurance, int distance) {
        return (endurance > distance);
    }

    void jump() {
        System.out.println("\nКот прыгает  " + getHeightjump() + " метр(а/ов)");
    }
    float getHeightjump() {
        return heightjump;
    }

    public void setHeightjump(float heightjump) {
        this.heightjump = heightjump;
    }
    boolean checkJump(float heightjump, int height) {
        return (heightjump>height);
    }
}
