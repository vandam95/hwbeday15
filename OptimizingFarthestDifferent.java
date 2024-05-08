
public class OptimizingFarthestDifferent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 4, 6, 2, 2, 6, 6, 4 };
		//int array[] = { 1,4, 6, 1, 2, 1, 1, 1 };

		System.out.println("FarthestDifferent is  " + farthestDifferentSolution(array));
		
		
		
	}
		
//O(n)
	public static int farthestDifferentSolution(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[array.length - 1]) {
				result = Math.max(result, array.length - 1 - i);
			}
		}
		return result;
	}
}
