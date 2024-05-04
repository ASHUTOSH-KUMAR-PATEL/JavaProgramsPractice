package org.irshita.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentManipulation {

    public static void main(String[] args) {

        List<Student> studentList = Stream.of(
                new Student(1, "Pikku", "Rana", 31, "Male", "DEV", "Banmankhi", 67, Arrays.asList("8689865466", "9087658901")),
                new Student(2, "Raja", "Kumar", 21, "Male", "HR", "Purnia", 18, Arrays.asList("8689865466", "9087658901")),
                new Student(3, "Sumit", "jaiswal", 18, "Male", "DEVOPS", "Patna", 43, Arrays.asList("8689865466", "9087658901")),
                new Student(4, "Rahul", "Raj", 23, "Male", "CIS", "Banmankhi", 70, Arrays.asList("8689865466", "9087658901")),
                new Student(5, "Ashutosh", "Patel", 29, "Male", "OP", "Bangalore", 89, Arrays.asList("8689865466", "9087658901")),
                new Student(6, "Pallavi", "Kumari", 17, "Female", "HR", "Patna", 34, Arrays.asList("8689865466", "9087658901")),
                new Student(7, "Shivani", "Singh", 14, "Female", "DEV", "Srinager", 12, Arrays.asList("8689865466", "9087658901")),
                new Student(8, "Jivachh", "Mahto", 33, "Male", "DEVOPS", "Banmankhi", 90, Arrays.asList("8689865466", "9087658901")),
                new Student(9, "Manish", "Kumar", 27, "Male", "OP", "Delhi", 65, Arrays.asList("8689865466", "9087658901")),
                new Student(10, "Ritik", "Patel", 24, "Male", "DEVOPS", "Purnia", 23, Arrays.asList("8689865466", "9087658901")),
                new Student(11, "Irshita", "Vachi", 11, "Female", "ACCOUNT", "Srinagar", 1, Arrays.asList("8689865466", "9087658901"))
        ).collect(Collectors.toList());

        // Find the list of student whose rank is b/w 50 to 100.
        List<Student> studentList1 = studentList.stream().filter(rank-> rank.getRank()>50 && rank.getRank()<100).collect(Collectors.toList());
        System.out.println(studentList1);

        // Find the Student who is staying in Banmankhi and sort them by their first name.
        List<Student> studentByCityBanmankhi = studentList.stream().filter(city -> city.getCity().equals("Banmankhi"))
                .sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        studentByCityBanmankhi.forEach(System.out::println);

        // Find All the department names.
        Set<String> listOfDept = studentList.stream().map(Student::getDept).collect(Collectors.toSet());
        listOfDept.forEach(p-> System.out.println(p));

        // Find All the Contact number from Student list
        List<List<String>> listOfContactList = studentList.stream().map(Student::getContactNumber).collect(Collectors.toList());
        System.out.println(listOfContactList);

        // Convert the above list of contact number to Map Function using flatMap method
        List<String> collectOfContact = studentList.stream().flatMap(contact -> contact.getContactNumber().stream()).collect(Collectors.toList());
        System.out.println(collectOfContact);

        // Grouping the Student by department names
        Map<String, List<Student>> listOfStudent = studentList.stream().collect(Collectors.groupingBy(Student::getDept));
        System.out.println(listOfStudent);

        Map<String, Long> listOfStudentCount = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        System.out.println(listOfStudentCount);

        // Find the department who is having maximum number of students.
        Map.Entry<String, Long> stringLongMaxEntry = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongMaxEntry);

        // Find the average age of Male and Female student
        Map<String, Double> averageStudentByAge = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
        System.out.println(averageStudentByAge);

        //Find the highest rank in each department
        Map<String, Optional<Student>> stringOptionalMap = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(stringOptionalMap);

        //Find the student who has second rank
        Student sortedStudent = studentList.stream().sorted(Comparator.comparing(Student::getRank))
                .skip(1)
                .findFirst().get();
        System.out.println(sortedStudent);
    }
}
