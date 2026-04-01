package core.basesyntax;

public class Ball extends Lottery {

    private int number;
    private String color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Your ball " + color
                + " color with number " + number;
    }
}
