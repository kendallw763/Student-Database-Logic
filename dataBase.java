import java.util.Scanner;
public class dataBase {
    public static void main(String[] args) {
        //ask how many user will be added
        System.out.println("Enter number of students");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student [] Students = new Student[numOfStudents];

        //create n number of new students
        for(int n = 0; n < numOfStudents; n++){
           //adds new student to the main program to be run.
            Students [n] = new Student();
            Students [n].enroll();
            Students [n].payTuition();

        }
        for(int n = 0; n < numOfStudents; n++) {
            System.out.println(Students[0].toString());

        }
    }
    }
