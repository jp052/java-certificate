public class BlocksTest {
	public static void main(String[] args) {
		BlocksTest block = new BlocksTest();
		block.anonymousBlock();
		block.anonymousNamedBlock();
	}
	
	private void anonymousBlock() {
		System.out.println("\n anonymousBlock:");
		int bitesOfCheese = 1;
		{
			boolean smallBit = true; //nur im scope des anonymen Block
			System.out.println(bitesOfCheese);
		}
		
		//System.out.println(smallBit); DOES NOT COMPILE: cannot find symbol smallBit, weil out of scope.		
	}
	
	private void anonymousNamedBlock() {
		System.out.println("\n anonymousNamedBlock:");
		int bitesOfCheese = 1;
		
		myBlock: 
		{
			boolean smallBit = true; //nur im scope des anonymen Block
			System.out.println(bitesOfCheese);
		}
		
		//System.out.println(smallBit); DOES NOT COMPILE: cannot find symbol smallBit, weil out of scope.		
	}
	
	private void loopWithAnonymousNamedBlock() {
		{ // Bedeutungsloser anonymer Block
			int i = 0;
			
			loop : //Anonymer Block mit dem Name "loop", kann von break/continue statment verwendet werden.        
			{
			 System.out.println("First Loop Lable line");

				while (true) {
					i++;
					if( i >2) break loop;   
					System.out.println("after break statement");				
				}
			 
			}
		}
	}
	
}