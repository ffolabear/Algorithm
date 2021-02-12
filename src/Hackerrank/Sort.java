package Hackerrank;

import java.util.*;
// CGPA(decreasing) - first name(alphabetical) - ID 

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

//-------------------------------------------------------------------------

public class Sort {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		
		
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				int ret = 0;
				
				if(o1.getCgpa() > o2.getCgpa()) {
					ret = -1;
				} else if (o1.getCgpa() < o2.getCgpa()) {
					ret = 1;
				} else  {
					
					System.out.println(o1.getFname().compareTo(o2.getFname()));
					
					if(o1.getFname().compareTo(o2.getFname()) < 0) {
						ret = -1;
					} else if (o1.getFname().compareTo(o2.getFname()) > 0) {
						ret = 1;
					
					} else {
						
						if(o1.getId() > o2.getId()) {
							ret = -1;
						} else if(o1.getId() < o2.getId()) {
							ret = 1;
						} else {
							ret = 0;
						}
						
					}
				}
				return ret;
			}

			
		});
		

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

}
