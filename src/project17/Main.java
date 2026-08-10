package project17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Leonid", 4);
        Student student2 = new Student("Nikita", 5);
        Student student3 = new Student("Nastya", 3);
        Student student4 = new Student("Vika", 5);

        List<Student> students = List.of(student1, student2, student3, student4);

        //ключ - оценка студента, значение - инфа по студентуам (List<Student>)
        Map<Integer, List<Student>> studentsGrateMap = new HashMap<>();

        for (Student student : students) {
            addStudent(studentsGrateMap, student);
        }

        System.out.println(studentsGrateMap);
    }

    public static void addStudent(Map<Integer, List<Student>> studentsGrateMap, Student student) {
        int grate = student.getGrate();

        List<Student> students1 = studentsGrateMap.get(grate);

        if (students1 == null) {
            List<Student> students = new ArrayList<>();
            students.add(student);
            studentsGrateMap.put(grate, students);
        }
        else {
            students1.add(student);
        }
    }
}
