package lesson_08;

public class Robot implements Participants {

    private String name;
    private int maxHeight;
    private int maxLength;
    boolean droppedOut;


    public Robot(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул через препятствие");
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал");
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public boolean isDroppedOut() {
        return droppedOut;
    }

    @Override
    public void setDroppedOut(boolean droppedOut) {
        this.droppedOut = droppedOut;

    }
}