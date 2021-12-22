package comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien",30,"HT");
        Student student1 = new Student("Nam",26,"HN");
        Student student2 = new Student("Anh",38,"HT");
        Student student3 = new Student("Tung",38,"CC");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student s :list) {
            System.out.println(s);
        }

        AgeComparator ageComparator = new AgeComparator();
        list.sort(ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st :
                list) {
            System.out.println(st);
        }
    }
}
