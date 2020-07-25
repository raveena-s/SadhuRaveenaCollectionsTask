package task;

public class Addop extends Operations{

	public void performAddOp()
	{
	  AddRecord addRecord=new AddRecord();
	  System.out.println("Enter the id number of the employee");
	  int empIdNumber=sc.nextInt();
     System.out.println("Enter the name of the employee");
	  String empName=sc.next();

	  addRecord.addRecord(empIdNumber,empName);
	}
}