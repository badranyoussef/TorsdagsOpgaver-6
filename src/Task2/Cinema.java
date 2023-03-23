package Task2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        //Youssef fejl 1: Rækkefølgen skulle rettes så array initialiseres før det tilgås
        this.seats = new String[rows][seats];
        populate();
        this.seats[0][0] = "X";

    }

    //Youssef fejl 2: Sætter alle sæder ud over direktøren til "0"
    public void populate(){
        for(int i = 0 ; i < seats.length ; i++){
            for(int j = 0 ; j < seats[i].length ; j++ ){
                seats[i][j] = "0";
            }
        }
    }




    public int getRows() {
            //Youssef, fejl 4: der manglede "-1" da den kigger ind i length
        return seats.length-1;
    }

    public int getSeats() {
        //Youssef, fejl 4: der manglede "-1" da den kigger ind i length
        return seats[0].length-1;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {

        if (seats[row][seat].equals("0")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("x")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }


    public String toString() {

        //Youssef fejl 3: Result var sat til "Null"
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
