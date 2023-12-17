import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourse;

    public Student(String Name, int Id){
        super(Name, Id);
        enrolledCourse = new ArrayList<String>();
    }

    public void enrollInCourse(String Course){
        enrolledCourse.add(Course);
    }

    @Override
    public String getUserDetail(){
        return 
        "\nStudent - Name: " + Name + ", ID: " + Id + 
        "\nEnrolled Courses: " + enrolledCourse;
    }
}

