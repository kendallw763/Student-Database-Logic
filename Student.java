import java.util.Scanner;

public class Student { //The class titled: student...
    //Variables
    final String firstName;
    final String lastName;
    String courses;
    private static String studentID;
    private int tuitionBalance = 0;
    final int gradeYear;
    private static int id = 5000;


    public Student() {//A constructor titled, Student...
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name");
        firstName = in.nextLine();
        System.out.println("Enter student last name");
        lastName = in.nextLine();
        System.out.println("Enter grade year: \n 1-Freshman \n 2-Sophomore \n 3-Junior \n 4-Senior");
        gradeYear = in.nextInt();
        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }
    private void setStudentId() {
        id++;
        studentID = gradeYear + "" + id;

    }
    public void enroll() {
        do {//End the loop when the user hits q
            System.out.println("Enter course to enroll. Press Q to quit");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses +"\n" + course;
                int costOfCourse = 600;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else{break;}
        } while(1!= 0);

        System.out.println("The student is now enrolled in: " + "\n" + courses);
        System.out.println("\n");
    }
    public void viewBalance(){
        System.out.println("The student tuition balance is: " + "$"+ tuitionBalance);
        System.out.println("\n");
    }
public void payTuition(
){
        viewBalance();
            System.out.println("Please enter payment amount");
            Scanner in = new Scanner(System.in);
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank You... ");
        viewBalance();
}
public String showInfo(){
        return "Student name: " +
                "\n" + firstName + " " + lastName +
                "\n" + "Courses enrolled:  " + courses +
                "\n" + "Tuition balance: " + "$" + tuitionBalance;
}
}







