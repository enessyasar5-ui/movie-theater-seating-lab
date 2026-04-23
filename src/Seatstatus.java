enum SeatStatus {
    EMPTY,
    RESERVED,
    BROKEN;
    public String getSymbol(){
        switch (this){
            case EMPTY:
                return "E";
            case RESERVED:
                return "R";
            case BROKEN:
                return "B";
            default:return "0";
        }
    }

}
