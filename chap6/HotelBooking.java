package chap6;


public class HotelBooking extends Payment implements Booking{
    private final String name ="Suban Noksamg";
    private final String address ="Songkhla";
    private final String telephone ="0611675623";
    
    public String getName(){
        return name;
    }

    @Override
    public boolean cancelBooking(int id) {
        return true;
    }

    @Override
    public void newBooking() {
        System.out.println("newBooking");
    }

    @Override
    public boolean updateBooking(int id) {
        return true;
    }

    
    
}