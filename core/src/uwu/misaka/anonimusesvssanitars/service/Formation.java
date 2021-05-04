package uwu.misaka.anonimusesvssanitars.service;

import java.util.ArrayList;

public class Formation {
    public ArrayList<Cell> cells = new ArrayList<>();

    public static Formation baseFormation() {
        Formation f = new Formation();
        f.cells.add(new Cell(0, 0));
        f.cells.add(new Cell(0, 2));

        f.cells.add(new Cell(1, 1));
        return f;
    }

    public static class Cell {
        public Unit unit;
        public int x;
        public int y;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isFull() {
            return unit != null;
        }
    }
}
