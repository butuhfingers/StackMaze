/**
 * Created by derek on 9/17/16.
 */
public class Coordinate implements iCoordinate {
    //Variables
    private int x = 0;
    private int y = 0;

    //Constructor
    public Coordinate(int x, int y) {
        setY(y);
        setX(x);
    }

    //Properties
    //Set our Y position
    private void setY(int y) {
        this.y = y;
    }
    //Set our x position
    private void setX(int x) {
        this.x = x;
    }

    //Return our y position
    public int getY() {
        return this.y;
    }
    //Return our x position
    public int getX() {
        return this.x;
    }

    @Override
    public String toString() {
        return "[X:" + getX() + ",Y:" + getY() + "]";
    }
}
