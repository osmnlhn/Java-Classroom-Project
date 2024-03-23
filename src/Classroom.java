import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    String buildingname;
    String roomname;

    ArrayList<Student> students;
    Seat [][] seats;

    public Classroom(String buildingname,String roomname, int rows, int colums ){
        this.buildingname=buildingname;
        this.roomname=roomname;
        this.seats=new Seat[rows][colums];

        for (int i=0;i < rows; i++){
            for (int j=0; j <colums;j++){
                seats[i][j]=new Seat(i,j);
            }
        }
     this.students= new ArrayList<Student>();

    }

    public void addStudents(Student student){
        this.students.add(student);
    }

    public void assignStudentToSeat(Student student){
        int rows=this.seats.length;
        int colums=this.seats[0].length;

        for (int i=0;i<rows;i++){
            for (int j=0;j<colums;j++){
                if (this.seats[i][j].studentInSeat==null){
                    this.seats[i][j].putStudentInSeat(student);
                    return;
                }
            }
        }
    }
    public void printAllStudents(){
        System.out.println("Students in class");
        for (Student student:this.students) {
            System.out.println(student);
        }
    }

    public String toString(){
        String s="\n";
        int rows = this.seats.length;
        int colums=this.seats[0].length;

        for (int i=0;i < rows; i++){
            for (int j=0; j <colums;j++){
                s += this.seats[i][j]+"\t";
            }
            s +="\n";
        }
     return s;
    }

    public static void main(String[] args) {
  Classroom hunstman= new Classroom("HH","105",10,5);
  Student bob=new Student("Bob","Roberts");
  Student finegan=new Student("Finegan","fineganw");

  hunstman.addStudents(bob);
  hunstman.addStudents(finegan);

  hunstman.assignStudentToSeat(finegan);
  hunstman.assignStudentToSeat(bob);

  hunstman.printAllStudents();

  System.out.println(hunstman);
    }
}

