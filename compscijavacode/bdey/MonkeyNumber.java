package bdey;

public class MonkeyNumber{
  public static void main(String[] args){
   
    int[] arr = new int[10];
   
    for (int i = 0; i < 10; i++) {
     arr[i] = (int)(Math.random())*10 + 1;
     
    for(int k = 0; k < arr.length; k++){
       System.out.print(arr[k]+",");
    }
   
  }
    System.out.print(arr);
}
}