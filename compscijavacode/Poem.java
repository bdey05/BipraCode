
public abstract class Poem{
	public abstract int numLines();
	public abstract int getSyllables(int k);
	public void printRhythm() 
	{
		String temp = "";
		for(int i=0;i<numLines();i++)
		{
			for(int n=0;n<getSyllables(i);n++)
			{
				if(n==getSyllables(i)-1)
					temp+="ta";
				else
					temp+="ta-";
			}
			temp+='\n';
		}
		System.out.println(temp);
	}
	
	
}