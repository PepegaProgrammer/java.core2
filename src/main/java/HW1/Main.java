package HW1;

public class Main {
    public static void main(String[] args) {
        Human Oleg = new Human();
        Cat Abobik = new Cat();
        Robot Mist = new Robot();
        Wall wall = new Wall();
        RunningTrack runningTrack = new RunningTrack();
        //Человек и бег
        Oleg.run(600);
        runningTrack.specificationsRT();
        if (Oleg.checkRun(Oleg.getEndurance(), runningTrack.getDistance())) {
            System.out.println("Человек "+ Oleg.getName()+ " справился с испытанием на бег");
        } else {
            System.out.println("Человек "+ Oleg.getName()+ " не справился с испытанием на бег");
        }

        //Человек и прыжок
        Oleg.jump();
        wall.specificationsW();
        if (Oleg.checkJump(Oleg.getHeightjump(), wall.getHeight())) {
            System.out.println("Человек "+ Oleg.getName()+ " справился с испытанием на прыжок");
        }
        else {
            System.out.println("Человек "+ Oleg.getName()+ " не справился с испытанием на прыжок");
        }

        //Кот и бег
        Abobik.run(100);
        runningTrack.specificationsRT();
        if (Abobik.checkRun(Abobik.getEndurance(), runningTrack.getDistance())) {
            System.out.println("Кот " + Abobik.getName() + "справился с испытанием на бег");
        } else {
            System.out.println("Кот " + Abobik.getName() + " не справился с испытанием на бег");
        }
        //Кот и прыжок
        Abobik.jump();
        wall.specificationsW();
        if (Abobik.checkJump(Abobik.getHeightjump(), wall.getHeight())) {
            System.out.println("Кот " + Abobik.getName() +" справился с испытанием на прыжок");
        } else {
            System.out.println("Кот " + Abobik.getName() +" не справился с испытанием на прыжок");
        }
        //Робот и бег
        Mist.run(10000);
        runningTrack.specificationsRT();
        if (Mist.checkRun(Mist.getEndurance(), runningTrack.getDistance())) {
            System.out.println("Робот " + Mist.getName() + " справился с испытанием на бег");
        } else {
            System.out.println("Робот " + Mist.getName() + " не справился с испытанием на бег");
        }
        //Робот и прыжок
        Mist.jump();
        wall.specificationsW();
        if (Mist.checkJump(Mist.getHeightjump(), wall.getHeight())) {
            System.out.println("Робот " + Mist.getName() +" справился с испытанием на прыжок");
        } else {
            System.out.println("Кот " + Mist.getName() +" не справился с испытанием на прыжок");
        }







    }
}
