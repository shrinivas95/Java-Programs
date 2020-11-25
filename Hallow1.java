package pattern_programs;

/*1       
  1 2     
  1   3   
  1 2 3 4 
  1   3   
  1 2     
  1       
 * 
 * 
 */

public class Hallow1 {
	
	public static void main (String[] args) {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=4;j++) {
				
				if(i==4 || j==1 || i==j || i+j==8 ) {
					System.out.print(j+ " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
