package ArrayandArrayLists.StoringGrades;

// GradeBook class using an array to store test grades.
public class GradeBook {

    private String courseName; // name of course this GradeBook represents
    private int[] grades; // array of student grades

    // constructor
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
        }

    // method to set the course name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
        }

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
        }
}
