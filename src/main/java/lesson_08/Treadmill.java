package lesson_08;

public class Treadmill implements Obstacles {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participants participant) {
        if (participant.getMaxLength() < length) {
            participant.setDroppedOut(true);
        } else {
            participant.run();
        }
    }
}
