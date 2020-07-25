package task;
import java.util.ArrayList;

public class CustomCollection{
	int empIdNumber;
	String empName;
	CustomCollection(int empIdNumber,String empName)
	{
		this.empIdNumber=empIdNumber;
        this.empName=empName;
	}
    
	static ArrayList<CustomCollection> customList=new ArrayList<CustomCollection>();
}