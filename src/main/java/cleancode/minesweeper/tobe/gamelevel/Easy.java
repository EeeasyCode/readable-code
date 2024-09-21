package cleancode.minesweeper.tobe.gamelevel;

public class Easy implements GameLevel {

        @Override
        public int getRowSize() {
            return 8;
        }

        @Override
        public int getColSize() {
            return 10;
        }

        @Override
        public int getLandMineCount() {
            return 10;
        }
}
