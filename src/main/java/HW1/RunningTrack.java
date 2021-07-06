package HW1;

public class RunningTrack {
    private int distance=500;

    void specificationsRT() {

        System.out.println("Беговая дорожка будет работать "+ getDistance() + " метров");
    }
    int getDistance() {
        return distance;
    }
    void setDistance(int distance) {
        this.distance = distance;
    }
}
