import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean Looping = true;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Student Name: \n");
        String Name = input.nextLine();

        do{
            try{
                System.out.print("Enter Student id: \n");
                int Id = input.nextInt(); 
                input.nextLine();
                Student student = new Student(Name, Id);
                System.out.print("Enter courses to enroll in (Seperated by comas): \n");
                String Courses = input.nextLine();
                student.enrollInCourse(Courses);
                String[] coursesArray = Courses.split(",\\s*");
                int CourseID = 101;
                for(String Course : coursesArray){
                    System.out.printf("\nCourse ID: %d", CourseID ++);
                    System.out.println("\nCourse Name: " + Course);
                    System.out.println(" - Student: " + Name);
                    }
                System.out.println(student.getUserDetail());
                Looping = false;
                } catch(java.util.InputMismatchException e){
                    System.out.println("Invalid input. Please enter a valid integer for student ID.");
                    input.nextLine();
                }
        } while(Looping == true);
        
        System.out.println();
        Teacher teacher = new Teacher("Yoga", 001);
        teacher.teachClasss("Math");

        Admin admin = new Admin("Hadza", 002);
        admin.manageSystem("universtiy of system");
        input.close();
    }
}
