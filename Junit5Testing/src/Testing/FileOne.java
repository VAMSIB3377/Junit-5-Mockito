package Testing;

public class FileOne {

	private int count = 0; 
	public int sumbytwo(int x)
	{
		return x+2;
	}
	
	
	public int countA(String word)
	{
		for(int i = 0;i<= word.length(); i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
			{
				count += 1;
			}
			
		}
		return count;
	}
	
}
