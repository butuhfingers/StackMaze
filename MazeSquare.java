/**
 * Created by aaron on 9/20/16.
 * Implemented by : Derek Crew on 9/21/16
 */
public class MazeSquare {

    // set the default wall state to no walls.
    private boolean[] wall = {false, false, false, false};
    private boolean visited;
    private boolean abandoned;
    private Coordinate myPosition;

    // new squares are built without walls
    public MazeSquare(Coordinate p) {
        myPosition = p;
        this.clear();
    }

    // this might be nice to have....
    public MazeSquare(Coordinate p, boolean[] wallSet) {
        this(p);
        for (int i = 0; i < wallSet.length && i < wall.length; i++) {
            wall[i] = wallSet[i];
        }
    }

    public void toggleWall(Direction dir) {
        this.wall[dir.value()] = !this.wall[dir.value()];
    }

    public boolean getWall(Direction dir) {
        return wall[dir.value()];
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void visit() {
        this.visited = true;
    }

    public boolean isAbandoned() {
        return this.abandoned;
    }

    public void abandon() {
        this.abandoned = true;
    }

    public void clear() {
        visited = false;
        abandoned = false;

        for(int i = 0;i < wall.length;i++){
            wall[i] = false;
        }
    }

    public Coordinate getPosition() {
        return this.myPosition;
    }

    public boolean equals(MazeSquare other) {
        Coordinate tempCoordinate = other.myPosition;

        if(this.myPosition.isEqual(tempCoordinate))
            return true;

        return false;
    }
}