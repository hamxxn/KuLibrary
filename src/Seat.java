public class Seat {
    int seatNum; //좌석 번호
    Boolean using=true; // 해당 좌석을 사용중인지 여번

    public Seat(int seatNum, Boolean using) {
        this.seatNum = seatNum;
        this.using = using;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public Boolean getUsing() {
        return using;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public void setUsing(Boolean using) {
        this.using = using;
    }

}
