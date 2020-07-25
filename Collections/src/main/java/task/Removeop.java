package task;

public class Removeop extends Operations{
	public void performRemoveOp()
	{
		RemoveRecord removeRecord=new RemoveRecord();
		System.out.println("Enter the index of the record to be removed");
		int index=sc.nextInt();
		removeRecord.removeRecord(index);
		}
	}