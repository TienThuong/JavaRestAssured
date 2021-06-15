package Models;

public class BookingDate {
    public String checkout;

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String checkin;

    public BookingDate(String checkout, String checkin) {
        this.checkout = checkout;
        this.checkin = checkin;
    }

    public BookingDate() {
    }
}

