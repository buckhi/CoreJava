package Section12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheaterMain {
    public static void main(String[] args) {
        Theater theater = new Theater("olympian", 8, 12);
//        theater.getSeats();
//        if (theater.reserveSeat("H11")) {
//            System.out.println("please pay");
//        } else {
//            System.out.println("sorry seat is taken");
//        }

        if (theater.reserveSeat("D12")) {
            System.out.println("please pay seat d12");
        } else {
            System.out.println("seat already reserved");
        }
        if (theater.reserveSeat("B13")) {
            System.out.println("please pay seat b13");
        } else {
            System.out.println("seat already reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00",13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("===================================");
    }
}
