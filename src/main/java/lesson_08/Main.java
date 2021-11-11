package lesson_08;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Вася", 10, 80);
        Robot robot1 = new Robot("R2D2", 2, 50);
        Cat cat1 = new Cat("Барсик", 12, 300);
        Human human2 = new Human("Петя", 3, 123);
        Robot robot2 = new Robot("TR560", 6, 345);
        Cat cat2 = new Cat("Пушок", 11, 60);

        Wall wall = new Wall(4);
        Treadmill treadmill = new Treadmill(200);

        Participants[] participants = {human1, robot1, cat1, human2, robot2, cat2};
        Obstacles[] obstacles = {wall, treadmill};

        for (Obstacles obstacle : obstacles) {
            for (Participants participant : participants) {
                if (!participant.isDroppedOut()) {
                    obstacle.overcome(participant);
                }
            }
        }
    }
}

