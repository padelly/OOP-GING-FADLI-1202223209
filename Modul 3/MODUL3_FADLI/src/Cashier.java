public class Cashier extends Bioskop {
    
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        boolean isBooked = false;

        for (int  x = 0; x < super.seats.length; x++){
            for(int y = 0; y < super.seats[x].length ;y ++){
                if(!((x == 0 && y == 2) || ( x == 1 && y == 5) || ( x == 3 && y == 7))){
                    if(super.seats[x][y] == 1){
                       isBooked = true;     
                       System.out.println("===================");
                       System.out.println("Nama: " + Name);
                       System.out.println("Phone: " + noHandphone );
                       System.out.println("Seat: " + seats);
                    }

                }
                
            } 
        

        }
        if(!isBooked){
            System.out.println("Anda belum memesan kursi");

        }

    
    }

}
