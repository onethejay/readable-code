package cleancode.minesweeper.tobe;

public class Cell {

    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String CLOSED_CELL_SIGN = "□";
    private static final String OPENED_CELL_SIGN = "■";

    private final String sign;
    private int nearByLandMineCount;
    private boolean isLandMine;
    
    // Cell이 가진 속성 : 근처 지뢰 숫자, 지뢰 여부
    // Cell의 상태 : 깃발 유무, 열렸다/닫혔다, 사용자가 확인함

    private Cell(String sign, int nearByLandMineCount, boolean isLandMine) {
        this.sign = sign;
        this.nearByLandMineCount = nearByLandMineCount;
        this.isLandMine = isLandMine;
    }


    public static Cell of(String sign, int nearByLandMineCount, boolean isLandMine) {
        return new Cell(sign, nearByLandMineCount, isLandMine);
    }

    public static Cell ofFlag() {
        return of(FLAG_SIGN, 0, false);
    }

    public static Cell ofLandMineSign() {
        return of(LAND_MINE_SIGN, 0, false);
    }

    public static Cell ofClosed() {
        return of(CLOSED_CELL_SIGN, 0, false);
    }

    public static Cell ofOpened() {
        return of(OPENED_CELL_SIGN, 0, false);
    }

    public static Cell ofNearByLandMineCount(int count) {
        return of(String.valueOf(count), 0, false);
    }

    public String getSign() {
        return sign;
    }

    public boolean isClosed() {
        return CLOSED_CELL_SIGN.equals(this.sign);
    }

    public boolean doesNotClosed() {
        return !isClosed();
    }
}
