// Comparator is used for multiple sorting criteria
// Comparable is used for natural ordering mens for only one sorting logic
// Both are used to sort objects in Java
//both are interfaces in Java
import java.util.*;

public class Comparator_Comparable {
    public static void main(String[] args) {

        // simple sorting
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);   
        arr.add(5);
        arr.add(20);
        arr.add(15);
        arr.add(30);
        System.out.println("\nBefore sorting: " + arr);
        Collections.sort(arr);
        System.out.println("\nAfter sorting: " + arr);


        // sorting using Comparable
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23));
        System.out.println("\nBefore sorting: ");
        for (Student s : students) {
            System.out.print("{ "+s.name + " , " + s.age+" }");
        }
        Collections.sort(students); // using Comparable
        System.out.println("\nAfter sorting by age: ");
        for (Student s : students) {
            System.out.print("{ "+s.name + " , " + s.age+" }");
        }


        // sorting using Comparator
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student("Alice", 22));    
        students2.add(new Student("Bob", 20));
        students2.add(new Student("Charlie", 23));
        System.out.println("\nBefore sorting by age: ");
        for (Student s : students2) {
            System.out.print("{ "+s.name + " , " + s.age+" }");
        }
        Collections.sort(students2, new StudentById()); // using Comparator by age
        System.out.println("\nAfter sorting by age: ");
        for (Student s : students2) {
            System.out.print("{ "+s.name + " , " + s.age+" }");
        }


        // sorting using Comparator by name
        ArrayList<Student> students3 = new ArrayList<>();
        students3.add(new Student("Alice", 22));
        students3.add(new Student("Bob", 20));
        students3.add(new Student("Charlie", 23));
        System.out.println("\nBefore sorting by name: ");
        for (Student s : students3) {
            System.out.print("{ "+s.name + " , " + s.age+" }");
        }
        Collections.sort(students3, new StudentByName()); // using Comparator by name
        System.out.println("\nAfter sorting by name: ");
        for (Student s : students3) {
            System.out.print("{ "+s.name + " , " + s.age+" }");
        }

    }
}


class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String x, int y)
    {
        this.name = x;
        this.age = y;
    }

    public int compareTo(Student ob)
    {
        return this.age - ob.age; // sorting based on age
    }
}



//Comparator for sorting by id
class StudentById implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;

    }
}
class StudentByName implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);

    }
}
