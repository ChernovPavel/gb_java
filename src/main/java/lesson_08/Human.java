package lesson_08;

public class Human implements Participants {

    public String name;
    public int maxHeight;
    public int maxLength;
    boolean droppedOut;

    public Human(String name, int maxHeight, int maxLength) {
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

    public void setDroppedOut(boolean droppedOut) {
        this.droppedOut = droppedOut;
    }
}