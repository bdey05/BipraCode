package IndexMaker;

import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>{
	
	public DocumentIndex(){
		super();
	}
	public DocumentIndex(int capacity){
		super(capacity);
	}
	private int foundOrInserted(String word){
		String upWord = word.toUpperCase();
		for(int i = 0; i<super.size(); i++){
			String w = super.get(i).getWord().toUpperCase();
			if(upWord.equals(w)){
				return i;
			}
			else if (upWord.compareTo(w)<0){
				super.add(i, new IndexEntry(word));
				return i;
			}
		}
		super.add(new IndexEntry(word));
		return super.size()-1;
	}
	public void addWord(String word, int num){
		 super.get(foundOrInserted(word)).add(num);
	}
	public void addAllWords(String str, int num){
		 String[] words = str.split("\\W+");
		 for(String word: words){
			 if(!word.isEmpty()){
				 addWord(word, num);
			 }
		 }
	}
	
	
}