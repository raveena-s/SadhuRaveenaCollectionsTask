package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations{
	Scanner sc=new Scanner(System.in);
	public void performAddInitialElements()
	{
		AddRecord addRecord=new AddRecord();	
		addRecord.addInitialElements();	
	}
	public void performAllOperations() throws Exception
	{
		String choice="";
	 do{
		System.out.println("Enter number of Operation You Want to Perform:");
		System.out.println("1.AddItem");
		System.out.println("2.RemoveItem");
		System.out.println("3.FetchItem");
		int option=sc.nextInt();
		if(option==1)
		{
			Addop performAdditionOperation=new Addop();
			performAdditionOperation.performAddOp();
		}
		else if(option==2)
		{
			Removeop performRemovingOperation=new Removeop();	
			performRemovingOperation.performRemoveOp();
		}
		else if(option==3)
		{
			Fetchop fo=new Fetchop();
			fo.performFetchOp();
		}
		else
		{
			throw new InputMismatchException();
		}
		System.out.println("Do You want to Continue: yes/no ");
	    choice=sc.next();
	 }while(choice.equals("yes"));
	}
	public static void main(String[] args) throws Exception {
		Operations op=new Operations();
		op.performAddInitialElements();
		op.performAllOperations();
		
	}
}