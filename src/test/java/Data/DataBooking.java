package Data;

import Models.BookingDate;
import Models.CreateBooking;

import java.util.ArrayList;
import java.util.List;

public class DataBooking {
    List<CreateBooking> createBookingList = new ArrayList<>();


    public List<CreateBooking> BookingInfo() {

        CreateBooking createBooking = new CreateBooking();

        createBooking.setFirstname("Linh");
        createBooking.setLastname("Thuy");
        createBooking.setTotalprice(2000);
        createBooking.setDepositpaid(true);

        BookingDate bookingDate = new BookingDate();
        createBooking.setBookingDate(bookingDate);
        bookingDate.setCheckout("2021-01-02");
        bookingDate.setCheckin("2021-03-04");

        createBooking.setAdditionalneeds("Girl Friend");


        createBookingList.add(createBooking);
        return createBookingList;

    }

}
