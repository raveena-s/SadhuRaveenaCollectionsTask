package task;

public class Fetchop extends Operations{
	
	public void performFetchOp()
	{
		FetchRecord fetchRecord=new FetchRecord();
		System.out.println("Enter the index of the record to be fetched");
		int index=sc.nextInt();
		fetchRecord.fetchRecord(index-1);
	}
}