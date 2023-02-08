public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Amapiano", 95.5);
        Student student2 = new Student("Afrobeat", 76.1);

        System.out.println(student1.getName() + "'s letter grade is: " + student1.getLetterGrade() );
        System.out.println(student2.getName() + "'s letter grade is: " + student2.getLetterGrade() );
    }
}
