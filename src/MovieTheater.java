public class MovieTheater {
    private static final SeatStatus[][] arr = new SeatStatus[5][6];

    static void initializeSeats() {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 6; c++) {
                arr[r][c] = SeatStatus.EMPTY;
            }
        }
        arr[2][2] = SeatStatus.RESERVED;
        arr[2][3] = SeatStatus.RESERVED;
        arr[2][5] = SeatStatus.RESERVED;
        arr[4][5] = SeatStatus.BROKEN;
        arr[1][5] = SeatStatus.BROKEN;
        arr[2][4] = SeatStatus.BROKEN;
    }

    public void printSeats() {
        int reserved = 0;
        int broken = 0;
        int empty = 0;
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 6; c++) {
                System.out.print(arr[r][c].getSymbol() + "   ");
                if (arr[r][c] == SeatStatus.BROKEN) {
                    broken++;
                } else if (arr[r][c] == SeatStatus.RESERVED) {
                    reserved++;
                } else if (arr[r][c] == SeatStatus.EMPTY) {
                    empty++;
                }
            }
            System.out.println();
        }
        System.out.println("Broken seats: " + broken);
        System.out.println("Reserved seats: " + reserved);
        System.out.println("Empty seats: " + empty);
    }
}
