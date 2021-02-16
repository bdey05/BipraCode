package IndexMaker;

import java.util.ArrayList;

public class IndexEntry{
	private String word;
	private ArrayList<Integer> numsList;

	public IndexEntry(String w){
		word = w.toUpperCase();
		numsList = new ArrayList<Integer>();
	}
	
	public void add(int num){
		Integer n = new Integer(num);
		if(!numsList.contains(n)){
			numsList.add(n);
		}
	}
	
	public String getWord(){
		return word;
	}
	
	public String toString(){
		word += " ";
		for(int i = 0; i<numsList.size(); i++) {
		   word += numsList.get(i) + ", ";
		}
		return word.substring(0, word.length()-2);
	}
}