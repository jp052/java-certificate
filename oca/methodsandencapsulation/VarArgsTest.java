public class VarArgsTest {
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}
	
	public static void main(String[] args) {
		walk(1); //output: 0
		walk(1,2); //output: 1
		walk(1,2,3); //output: 2
		walk(1, new int[] {4, 5, 6}); //output: 3
	}
}