public class Haiku extends Poem{
	
	public int numLines(){
		return 3;
	}
	
	public int getSyllables(int k){
		if(k == 0 || k == 2)return 5;
		else return 7;
	}
	
}