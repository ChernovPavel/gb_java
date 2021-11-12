package lesson_08;

public class Wall implements Obstacles {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participants participant) {
        if (participant.getMaxHeight() < height) {
            participant.setDroppedOut(true);
        } else {
            participant.jump();
        }
    }
}
