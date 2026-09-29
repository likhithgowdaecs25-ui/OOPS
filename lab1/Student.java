import java.util.*;
class Studentdetails{
	String name;
	int USN;
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter USN:");
		USN = sc.nextInt();
		System.out.print("Enter Name:");
		name = sc.next();
	}
	public void display(){
		System.out.println("USN:"+USN);
		System.out.println("Name:"+name);
	}
}
public class Student{
	public static void main(String[] args){
		Studentdetails s1 = new Studentdetails();
		Studentdetails s2 = new Studentdetails();
		Studentdetails s3 = new Studentdetails();
		s1.accept();
		s1.display();
		s2.accept();
		s2.display();
		s3.accept();
		s3.display();
	}
}

	 
