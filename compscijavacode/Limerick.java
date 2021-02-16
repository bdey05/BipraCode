public class Limerick extends Poem{
		
	public int numLines(){
		return 5;
	}
	
	public int getSyllables(int k){
		if(k == 0 || k == 1 || k == 4){
			return 9;
		}
		else return 6;
	}
	
}