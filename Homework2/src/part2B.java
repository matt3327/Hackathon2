
public class part2B {
	public static void main(String[] args) {
	
		String[] name = {"Phil", "Veena", "John", "Mark", "Maria"};
		int[] marks = {1000, 4000, 2000, 1500, 2500};
		int[] studentId = {100, 101, 102, 103, 104};
		
		
		for(int i=0; i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(marks[i] < marks[j])
				{
					//sorting the Marks
					int temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
					
					//sorting the Ids 
					int tempSId = studentId[i];
					studentId[i] = studentId[j];
					studentId[j] = tempSId;
					
					//sorting the names
					String tempN = name[i];
					name[i] = name[j];
					name[j] = tempN;
					
				}
			}
			
		}
		
		for(int i=0; i<5;i++)
		{
			System.out.println("Name -> "+ name[i] + " |Student ID -> "+ studentId[i] + " |Marks > " + marks[i]);
		}
	}

}
