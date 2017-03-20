

//James Glass

public class hanoitowers {

	
	public static  String game(int n, int initstick, int endstick){
	if(n==1){
		
		return "  "+ initstick+" to " +endstick;
		
	}
		//hello
	//move top part to middle
	else {
		String e1,e2,e3;
		//we need the auxstick
		int auxstick=6-initstick-endstick; //if init stick is 1, the middle one 2 and last 3 we get 6
		//if numbers change we can always find out auxstick
		
		e1=game(n-1,initstick,auxstick);
			//from our first to our our helping tower
		
		e2="  "+initstick+" to " +endstick;
		
		
		e3=game(n-1,auxstick,endstick);
		
		return e1+e2+e3;
		
				}
		
			
		
			
			
	
		
	}
public static int minimum (int n){
	//just to know the minimum moves necessary
int min=2;
	for(int i=0;i<n-1;i++){
		 
		min=min*2;
		
	}
	
		return min-1;
	}	

public static int count(String str){
	//everytime theres a move we can count the spaces there is, then we know a move has been done.
	int spaceCount = 0;
	for (char c : str.toCharArray()) {
	    if (c == ' ') {
	         spaceCount++;
	    }
	}
	return spaceCount/4;
}


public static void main(String[] args) {

	//hanoitowers a=new hanoitowers();
	
	
	System.out.println(game(3,1,3));
	
	System.out.println("minimum number of moves are:"+minimum(3));
	
	System.out.println(count(game(3,1,3)));

	
	
	
}}