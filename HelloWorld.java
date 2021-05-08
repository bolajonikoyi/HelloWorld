package String;

public class reverseSentence {

	public static void reverseSente(){
		String word= "i am coming";
		String reverse="";
		for (int i= word.length()-1; i >=0; i--){
			
			reverse= reverse+ word.charAt(i);
		}
		System.out.println("reverse is: "+reverse);
	}
	
	public static void reverseSente2(){
		String name= "BOLAJI ONIKOYI";
		String reversed= "";
		for (int i =name.length()-1;i>=0;i--){
			reversed= reversed+name.charAt(i);
		}
		System.out.println(reversed);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseSente();
		reverseSente2();
	}

}


