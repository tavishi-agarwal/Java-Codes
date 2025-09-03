
abstract class Booking{
    double amount;
    String bookingid;
    Booking(double amount, String bookingid){
        this.amount = amount;
        this.bookingid = bookingid;
    }
    void generateTicket(){
        System.out.println("Ticket generated with booking id: "+bookingid);
    }
    abstract void confirmBooking();
}

interface Cancelable{
    void cancelBooking();
}
interface Scheduable{
    void scheduleBooking(String time);
}
class cabBooking extends Booking implements Cancelable, Scheduable{
    
    cabBooking(double amount, String bookingid){
        super(amount, bookingid);
    }
    public void confirmBooking(){
        System.out.println("Cab booking confirmed for rupees  "+amount + " with id  "+bookingid);
    }
    public void scheduleBooking(String time){
        System.out.println("Cab booking scheduled at  "+time);
    }
    public void cancelBooking(){
        System.out.println("Cab booking cancelled for cab with id  "+bookingid +" refund ruppes 300");
    }
    
}
class trainBooking extends Booking implements Cancelable{
    trainBooking(double amount, String bookingid){
        super(amount, bookingid);
    }
    public void confirmBooking(){
        System.out.println("Train booking confirmed for rupees  "+amount + " with id  "+bookingid);
    }
    public void cancelBooking(){
        System.out.println("Train booking cancelled for train with id  "+bookingid +" refund ruppes 1000");
    }
}
class busBooking extends Booking{
    busBooking(double amount, String bookingid){
        super(amount, bookingid);
    }
    public void confirmBooking(){
        System.out.println("Bus booking confirmed for rupees  "+amount + " with id  "+bookingid);
}
}
public class T1 {
    public static void main(String[] args) {
        cabBooking cab = new cabBooking(500, "CAB101");
        trainBooking train = new trainBooking(1200, "TRN202");
        busBooking bus = new busBooking(200, "BUS303");

        cab.confirmBooking();
        cab.generateTicket();
        cab.scheduleBooking("10:00 AM");
        cab.cancelBooking();

        System.out.println("\n");

        train.confirmBooking();
        train.generateTicket();
        train.cancelBooking();

        System.out.println("\r");

        bus.confirmBooking();
        bus.generateTicket();

    }

}

