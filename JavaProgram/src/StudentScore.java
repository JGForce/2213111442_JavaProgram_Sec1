import java.util.*;

public class StudentScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int size = scan.nextInt();
		Student[] std = new Student[size];
		for(int i=0;i<std.length;i++) {
			std[i] = new Student();//กำหนดค่าของ array ให้เรียกใช้เมธอดในคลาสต้นแบบ
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("--------------------------------------");
			System.out.print("Input student name: ");
			//std[i] = scan.next();
			std[i].setName(scan.next());
			System.out.print("Input student score: ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again: ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("-------------------------------------");
		for(Student stds : std) {
			if(stds.isPass()) {
				System.out.println(">> "+stds.getName()+" get grade " +stds.findGrade());
			}
		}
		
		
	}

}
