package co.uptc.edu.cine.model;

public class Seat {
    private char row;
    private int seat;

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "[" + getRow() + getSeat() + "]";
    }

    public static void main(String[] args) {
        Seat seat = new Seat();
        seat.setRow('A');
        seat.setSeat(1);
        System.out.println(seat);
    }
}
