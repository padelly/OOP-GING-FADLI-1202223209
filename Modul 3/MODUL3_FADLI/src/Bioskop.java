public class Bioskop extends User {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int ROWS = 5;
    private int SEATS_PER_ROW = 10;

    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    int [][] seats = new int [ROWS][SEATS_PER_ROW];
    // TO DO: Create 2 dimensional array to store seat reservation status

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[0][2] = 1;
        seats[1][5] = 1;
        seats[3][7] = 1;
    
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("=== Booking Tiket Bioskop ===");
        for (int  x = 0; x < ROWS ; x++){
            for(int y = 0; y < SEATS_PER_ROW ;y ++){
                System.out.println(seats[x][y] + "\t");
                
            }
            System.out.println();

    }

    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if(seats [row][seat] == 0){
            seats [row][seat] = 1;
            System.out.println("Kursi Berhasil Dipesan");
        }else{
            System.out.println("Kursi Tidak Tersedia");
        }
        
        

    }
}