package pack;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ilya","Yedomakha",3, 8.3);
        Student st6 = new Student("Ilya","Yedomakha",3, 8.3);
        Student st7 = new Student("a","ss",3, 8.3);

        Student st2 = new Student("Andrey","Petrov",1, 6.4);
        Student st3 = new Student("Nikita","Ivanov",4, 8.9);
        Student st4 = new Student("Petro","Rushnitsya",1, 5.9);
        Student st5 = new Student("Dmitro","Kovbasa",4, 7.9);

        List<Student> students1 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        List<Student> students4 = new ArrayList<>();
        students1.add(st1);
        students1.add(st2);
        students1.add(st3);
        students1.add(st4);
        students1.add(st5);
        List<Integer> students2 = new ArrayList<>();

        students2 = students1.stream().map(s->{
        if(s.getAvgGrade() != 7.9)
        return s.getName().length();
            return null;
        }).collect(Collectors.toList());
        System.out.println(students2);

        students4 = students1.stream().filter(s->s.getAvgGrade()>8).collect(Collectors.toList());
        System.out.println("4: " + students4);

        students1.stream().forEach(
            System.out::println
        );
//        Predicate<Student> p = (e1,e2)->e1.equals(e2);
        System.out.println(st1.equals(st6));
        System.out.println(st1.hashCode());
        System.out.println(st6.hashCode());
        System.out.println(students1);
        Collections.sort(students1);
//        System.out.println(students1);
        System.out.println(students1);

        System.out.println(st7.equals(st6));
        System.out.println(st7.compareTo(st6));

        students3.addAll(remove(students1,student -> student.getAvgGrade()<7.2));
        System.out.println(students3);
    }

    static List<Student> remove(List<Student> studlist, Predicate<Student> prd){
        for(int i = 0; i < studlist.size();){
            if(prd.test(studlist.get(i))){
                studlist.remove(i);
            }else i++;
        }
        return studlist;
    }
}
