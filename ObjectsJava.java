// Create Student Object List and Sort by Marks
package questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student :" + "name='" + name + '\'' + ", marks=" + marks;
    }
}

    public class ObjectsJava {
        public static void main(String[] args) {
            List<Student> studentList = new ArrayList<>();

            studentList.add(new Student("Prasad", 89));
            studentList.add(new Student("Raju", 91));
            studentList.add(new Student("Mahesh", 93));
            studentList.add(new Student("Suresh", 67));
            studentList.add(new Student("Rupesh", 68));
            studentList.add(new Student("Bhupesh", 49));

            System.out.println("sort by Ascending: ");
            studentList.sort(Comparator.comparingInt(Student :: getMarks));
            studentList.forEach(System.out::println);

        }
    }
