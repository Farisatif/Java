package nestedclass;

public class School {

    String schoolName;

    School(String name) {
        schoolName = name;
    }

    // Inner class inside School
    class Teacher {
        String teacherName;

        Teacher(String name) {
            teacherName = name;
        }

        void showInfo() {
            System.out.println("Teacher: " + teacherName + " works at school: " + schoolName);
        }
    }
}

class StudentSchool {

    String studentName;

    StudentSchool(String name) {
        studentName = name;
    }

    // Inner class inside StudentSchool
    class Student {
        int age;

        Student(int a) {
            age = a;
        }

        void showInfo() {
            System.out.println("Student: " + studentName + " is " + age + " years old");
        }
    }
}

class nestedExample {
    public static void main(String[] args) {

        School mySchool = new School("fares School ?");

       
        School.Teacher teacher = mySchool.new Teacher("Mr. Ahmed");
        teacher.showInfo();

        
        StudentSchool ss = new StudentSchool("Lama");
        
    
        StudentSchool.Student student = ss.new Student(20);
        student.showInfo();
    }
}
