package Models;

public class CreateBooking {
    public String firstname;
    public String lastname;
    public float totalprice;
    public boolean depositpaid;
    public BookingDate bookingdates;
    public String additionalneeds;

    public CreateBooking(String firstname, String lastname, float totalprice, boolean depositpaid, BookingDate bookingDate, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingDate;
        this.additionalneeds = additionalneeds;
    }

    public CreateBooking() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public BookingDate getBookingDate() {
        return bookingdates;
    }

    public void setBookingDate(BookingDate bookingDate) {
        this.bookingdates = bookingDate;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
}
