package hashMap_hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 19, "NY");

        Map<Integer, Student> studentMap = new HashMap<>();
        //đặt các entry vào trong Map
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(1, student2);


        //trả lại đối tượng trong studentMap
        System.out.println("-----entrySet");
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        //trả về true nếu Map trống.
        System.out.println("-----isEmpty");
        System.out.println(studentMap.isEmpty());

        //studentMap chứa key đang gọi - true/false
        System.out.println("-----containsKey");
        System.out.println(studentMap.containsKey(5));

        //studentMap chứa value đang gọi - true/false
        System.out.println("-----containsValue");
        System.out.println(studentMap.containsValue("Ha"));
        System.out.println(studentMap.containsValue(student3));

        //gỡ bỏ entry theo key
        System.out.println("-----remove");
        System.out.println(studentMap.remove(3));
        System.out.println(studentMap.remove(5));

        //trả về các key trong map
        System.out.println("-----keySet");
        System.out.println(studentMap.keySet());

        //studentMap trả về số lượng Entry
        System.out.println("-----size");
        System.out.println(studentMap.size());

        //studentMap trả về value liên kết key 2
        System.out.println("-----get key 2");
        System.out.println(studentMap.get(2));

        //trả về tất cả value trong Map
        System.out.println("-----values");
        System.out.println(studentMap.values());
        studentMap.values();


        //-----------------------
//        System.out.println(".............set");
//        Set<Student> students = new HashSet<Student>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student1);
//
//        for (Student s :
//                students) {
//            System.out.println(s.toString());
//        }
    }
}
