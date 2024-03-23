public class Seat {

    int row;
    int column;
    Student studentInSeat;

    public Seat(int row,int column){
        this.row=row;
        this.column=column;
    }

    public void putStudentInSeat(Student student){
        this.studentInSeat=student;
    }

    public String toString(){
        return this.row + "," + this.column + ":" + this.studentInSeat;
    }
}
