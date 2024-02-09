class  College{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sNum=100;
		s1.sName="Santhoshi";
		s1.sCourse="core java";
		s1.fee=2500;
		Student s2=new Student();
        s2.sNum=102;
		s2.sName="Sowmya";
		s2.sCourse="advance java";
		s2.fee=3500;
		System.out.println("Student1 object details");
		System.out.println("s1.sNum \t:" +s1.sNum);
		System.out.println("s1.sName\t:" +s1.sName);
		System.out.println("s1.sCourse \t:" +s1.sCourse);
		System.out.println("s1.sfee \t:" +s1.fee);
		System.out.println("Student object details");
		System.out.println("s2.sNum \t:" +s2.sNum);
		System.out.println("s2.sName\t:" +s2.sName);
		System.out.println("s2.sCourse\t:" +s2.sCourse);
		System.out.println("s2.sfee \t:" +s2.fee);
	}
}
