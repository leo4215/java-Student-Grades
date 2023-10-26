import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the student name, followed by his/her 1st, 2nd, and 3rd grade:");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println();
        System.out.println(student);
        sc.close();
    }
}
