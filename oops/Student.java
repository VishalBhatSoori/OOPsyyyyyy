class Stud{
	int rollno;
	String name;
	float marks;

	Stud(){
		this (0,"",0.0f);
	}
	
	Stud(Stud somebody){
		this.name=somebody.name;
		this.rollno=somebody.rollno;
		this.marks=somebody.marks;
	}

	Stud(int rollno,String name,float marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}

	

	void greetings(){
		System.out.println("This method prints the name of the object Student"+ this.name);
	}

	void changeName(String name){
		this.name=name;
	}

	//Stud()
}

public class Student{
	public static void main(String[]args){
		Stud vishal = new Stud(21,"Vishal",88.5f);

		Stud vishal_bhat = new Stud();
		
		System.out.println(vishal.rollno);
		System.out.println(vishal.name);
		System.out.println(vishal.marks);

		System.out.println(vishal_bhat.rollno);
	}
}
