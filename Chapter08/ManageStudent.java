package Chapter08;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] students = null;
        ManageStudent ms = new ManageStudent();
        students = ms.addStudent();
        ms.printStudents(students);
    
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "01011111111", "andantej99@naver.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for (Student student:students) {
            System.out.println(student);
        }

    }








}
