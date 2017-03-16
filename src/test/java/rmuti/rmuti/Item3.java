package rmuti.rmuti;

public class Item3 {

	public int countEven(int arr[]){
		int counter = 0;
		for(int i=0; i< arr.length; i++){
			if(arr[i]%2==0){
				counter++;
			}
		}
		return counter;	
	}
	
	public static void main(String [] args){
		Item3 item3 = new Item3();
		System.out.println(item3.countEven(new int[]{1,2,3,4,4,5}));
	}
}
