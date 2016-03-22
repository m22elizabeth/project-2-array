package Array;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        int a[] = new int[5];
		        
		         a[0] = 1;
		         a[1] = 5;
		         a[2] = 3;
		         a[3] = 4;
		         a[4] = 8;
		         
		        for( int i = 0; i < a.length; i++) {
		        System.out.println("[" + i + "]" + a[i]);
		        
		        }
		        
		        int ROW = 5, COL = 5; 
		        
		        int i2[][] = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25} };
		        {
		        for ( int ii = 0; ii < ROW; ii++ ) {
		            for (int pp = 0; pp < COL; pp++) {
		                System.out.print("[" + ii + "][" + pp + "]" + i2[ii][pp]);
		            }
		            System.out.println(); 
		        }
		        
		        
		    
		    

		    }

		}
	}


