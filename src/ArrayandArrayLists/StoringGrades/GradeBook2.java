package ArrayandArrayLists.StoringGrades;

// GradeBook class using a two-dimensional array to store grades.
public class GradeBook2 {

    private String courseName; // name of course this grade book represents
    private int[][] grades; // two-dimensional array of student grades

    // two-argument constructor initializes courseName and grades array
    public GradeBook2(String courseName, int[][] grades) {
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

    // perform various operations on the data
    public void processGrades() {
        // output grades array
        outputGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // output grade distribution chart of all grades on all tests
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {

        // assume first element of grades array is smallest
        int lowGrade = grades[0][0];

        // loop through rows of grades array
        for (int[] studentGrades : grades)
        {
            // loop through columns of current row
            for (int grade : studentGrades)
            {
                // if grade less than lowGrade, assign it to lowGrade
                if (grade < lowGrade)
                    lowGrade = grade;
            }
        }

        return lowGrade;
    }

    // find maximum grade
    public int getMaximum() {
        // assume first element of grades array is largest
        int highGrade = grades[0][0];

        // loop through rows of grades array
        for (int[] studentGrades : grades) {

            // loop through columns of current row
            for (int grade : studentGrades) {

                // if grade greater than highGrade, assign it to highGrade
                if (grade > highGrade)
                    highGrade = grade;
            }
        }

        return highGrade;
        }

    // determine average grade for particular set of grades
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        // sum grades for one student
        for (int grade : setOfGrades)
            total += grade;

        // return average of grades
        return (double) total / setOfGrades.length;
    }

    // output bar chart displaying overall grade distribution
    public void outputBarChart() {

        System.out.println("Overall grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade in GradeBook, increment the appropriate frequency
        for (int[] studentGrades : grades) {

            for (int grade : studentGrades)
                ++frequency[grade / 10];
        }

        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {

            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
            System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }



}
