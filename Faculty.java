import java.util.*; 
public class Faculty extends Timetable{
    private ArrayList<String> courses = new ArrayList<String>();
    void addCourses(String s){
        this.courses.add(s);
    }
}