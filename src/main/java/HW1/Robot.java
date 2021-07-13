package HW1;

public class Robot implements Minions {
    private int endurance = 10000;
    float heightjump = 5f;
    private String name = "Мистакий";

    void run(int endurance) {
        this.endurance=endurance;
        System.out.println("\nРобот бежит " + getEndurance() + " метров");
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
        System.out.println("\nРобот прыгает  " + getHeightjump() + " метр(а/ов)");
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
