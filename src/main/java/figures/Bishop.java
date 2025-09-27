package figures;

public class Bishop extends Figure {

    public Bishop(String color, char x, int y) {
        super(color, x, y);
    }

    @Override
    public boolean moveTo(char targetX, int targetY) {
        int xDiff = Math.abs(targetX - this.x);
        int yDiff = Math.abs(targetY - this.y);
        return xDiff == yDiff;
    }
}
