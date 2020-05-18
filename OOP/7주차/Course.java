public class Course {
	  private String courseName;
	  private String[] students = new String[4];
	  private int numberOfStudents;
	  
	  public static void main(String[] args) {
			int num1, num2 = 0;
				  
			Course c1 = new Course("course1");
			Course c2 = new Course("course2");
			
			c1.addStudent("Peter Jones");
			c1.addStudent("Brian Smith");
			c1.addStudent("Anne Kennedy");
			
			c2.addStudent("S1");
			c2.addStudent("S2");
			c2.addStudent("S3");
			c2.addStudent("S4");
			
			num1 = c1.getNumberOfStudents();
			num2 = c2.getNumberOfStudents();
				  
			System.out.print("Number of students in "+c1.getCourseName()+" : "+num1+"\n");
			
			String[] students1 = c1.getStudents();
			for(int i=0;i < c1.getNumberOfStudents();i++) {
				System.out.print(students1[i]+", ");
			}
			
			System.out.print("\nNumber of students in "+c2.getCourseName()+" : "+num2+"\n");
			
			String[] students2 = c2.getStudents();
			for(int i=0; i<c2.getNumberOfStudents();i++) {
				System.out.print(students2[i]+", ");
			}
			
			c1.dropStudent("Peter Jones");
			students1 = c1.getStudents();
			num1 = c1.getNumberOfStudents();
			
			System.out.print("\nNumber of students in course1 arter drop Peter Jones : "+num1+"\n");
			for(int i=0;i < c1.getNumberOfStudents();i++) {
				System.out.print(students1[i]+", ");
			}
			
			c1.clear();
			students1 = c1.getStudents();
			num1 = c1.getNumberOfStudents();
			
			System.out.print("\nNumber of students in course1 after clear : "+num1);
			
			c2.dropStudent("S2");
			students2 = c2.getStudents();
			num2 = c2.getNumberOfStudents();
			
			System.out.print("\nNumber of students in course2 after drop S2 : "+num2+"\n");
			for(int i=0; i<num2; i++) {
				System.out.print(students2[i]+", ");
			}
			
			c2.clear();
			students2 = c2.getStudents();
			num2 = c2.getNumberOfStudents();
			
			System.out.print("Number of students in course2 after clear : "+num2);
	  }
	  
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
		  if(students.length == numberOfStudents) {
			  String[] arr = new String[students.length + 1];
		 
			  for(int i=0;i<numberOfStudents;i++) {
		    	arr[i] = students[i];
			  }
		  }
		  
		  students[numberOfStudents] = student;
		  numberOfStudents++;
	  }
	  
	  public String[] getStudents() {
	    return students;
	  }

	  public int getNumberOfStudents() {
	    return numberOfStudents;
	  }  

	  public String getCourseName() {
	    return courseName;
	  }  
	  
	  public void dropStudent(String student) {
		  int index = find(student);
		  
		  if(index>=0) {
			  String[] ar = new String[students.length - 1];
		  
			  for(int i=0, j=0; i<ar.length ; i++, j++) {
				  if(i == index) {
					  j++;
				  }
				  	ar[i] = students[j];
			  }
			  
			  this.students = ar;
			  numberOfStudents--;
		  }
		  else {
			  System.out.print("There is no Student.");
		  }
	  }
	  
	  public void clear() {
		  students = new String[1];
		  numberOfStudents = 0;
	  }
	  
	  public int find(String student) {
		  for(int i=0; i< numberOfStudents; i++) {
			  if (students[i]==student) {
				  return i;
			  }
		  }
		  
		  return -1;
	  }
}