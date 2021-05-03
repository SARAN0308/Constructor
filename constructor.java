package firstProject;
public class StudentFees {
String studentname;
int rollnumber;
int Class;
char section;
String schoolname;
String result;
public StudentFees(String a,int b,int c,char d, String e,String f) {
	studentname=a;
	rollnumber=b;
	Class=c;
	section-=d;
	schoolname=e;
	result=f;
}
void displayprofileof() {
System.out.println("the student name is:"+studentname);
System.out.println(" roll  number is:"+rollnumber);
System.out.println(" class is:"+Class);
System.out.println("section is:"+section);
System.out.println("the school name is:"+schoolname);
System.out.println("the result is:"+result);


}
public boolean check() 
{
	if(result =="pass") {
		return true;
	}
	else
	{
		return false;}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentFees s1= new StudentFees("RAJ",1,12,'S',"SELVAM","PASS");
		StudentFees s2= new StudentFees("kumar",3,10,'d',"mechnet","fail");
		s1.displayprofileof();
		s1.check();
		s2.displayprofileof();
		s2.check();
	}

}

