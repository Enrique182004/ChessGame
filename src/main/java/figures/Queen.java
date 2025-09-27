package figures;

public class Queen extends Rook {

    public Queen(String color, char x, int y) {
        super(color, x, y);
    }

    @Override
    public boolean moveTo(char targetX, int targetY) {
        // Rook-style movement
        if (super.moveTo(targetX, targetY)) {
            return true;
        }

        // Bishop-style movement (re-implemented here)
        int xDiff = Math.abs(targetX - this.x);
        int yDiff = Math.abs(targetY - this.y);
        return xDiff == yDiff;
    }
}
