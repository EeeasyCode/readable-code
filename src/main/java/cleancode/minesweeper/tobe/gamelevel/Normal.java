package cleancode.minesweeper.tobe.gamelevel;

public class Normal implements GameLevel {

        @Override
        public int getRowSize() {
            return 14;
        }

        @Override
        public int getColSize() {
            return 18;
        }

        @Override
        public int getLandMineCount() {
            return 40;
        }
}
