
//will do later

public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.print("Exiting");
        int i = 5;
        try {
            while (i != 0) {

                System.out.print(".");
                Thread.sleep(400);
                i--;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

