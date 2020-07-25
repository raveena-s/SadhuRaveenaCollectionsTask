  package task;

public class AddRecord
{
	int[] empIdNumbers= {1,2,3,4,5,6,7,8,9,10};
	String[] empNames= {"Raveena","Bhargavi","Swetha","Sadhana","Alekhya","Meghana","Jin","Suga","Hosoek","Namjoon"};
 	public void addInitialElements()
	{
 	for(int i=0;i<10;i++)
		{
		  CustomCollection.customList.add(new CustomCollection(empIdNumbers[i],empNames[i]));
		}
	}
	public void addRecord(int empIdNumber,String empName)
	{
		 CustomCollection.customList.add(new  CustomCollection(empIdNumber,empName));
	}
}