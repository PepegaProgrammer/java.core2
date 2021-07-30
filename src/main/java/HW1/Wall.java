package HW1;

public class Wall {
    private int height=1;
    void specificationsW () {
        //setHeight(2);
        System.out.println("Стена высотой " + getHeight()+ " метр(а/ов)");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
