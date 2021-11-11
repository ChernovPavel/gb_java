package lesson_08;

public interface Participants extends Runner, Jumper {
    int getMaxHeight();

    int getMaxLength();

    boolean isDroppedOut();

    void setDroppedOut(boolean droppedOut);
}
