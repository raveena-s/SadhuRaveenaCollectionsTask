package task;

public class FetchRecord{
	public void fetchRecord(int index)
	{
		System.out.println("IdNumber:"+CustomCollection.customList.get(index).empIdNumber);
		
	System.out.println("Name:"+CustomCollection.customList.get(index).empName);
	
	}
}