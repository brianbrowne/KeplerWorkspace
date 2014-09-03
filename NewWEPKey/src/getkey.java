import java.util.Random;


public class getkey 
{
	public static void main (String args [])
	{
		
		
		for(int i=1;i<=26;i++){
			
			Random rand = new Random();
			int randomInt = rand.nextInt(9)+1;
			
			Random r = new Random();
			char c = (char) (r.nextInt(26) + 'a');
			
			
			System.out.print(randomInt);
			System.out.print(c);
		}
	}
	
	
}
