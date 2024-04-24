public class SeatManager {
    ArrayList<Seat> seats=new ArrayList<>();
    void printSeat(){
        System.out.println("잔여 좌석입니다.");
        Iterator<Seat> iterator=seats.iterator();
        if(iterator.hasNext()){
            Seat seat=iterator.next();
            if(seat.isReserved()){
                System.out.print(seat.getSeatNumber()+" ");
            }
        }
    }
}
