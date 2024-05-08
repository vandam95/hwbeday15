package hwbeday15_FindingSquareRootOperation;

public class FindingSquareRoot {
	//O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6000;
		int b = 7000;
		System.out.println("Operations Number is " + findingSquareRootOperations(a, b));
	}

	public static int findingSquareRootOperations(int a, int b) {
		int sqrtA = (int) Math.sqrt(a);
		int sqrtB = (int) Math.sqrt(b);
		int count = 0;
		int temp = sqrtA;
		if (sqrtA < sqrtB) {
			count = count + 1;
		}
		for (int i = 0; i <= sqrtB - sqrtA; i++) {
			if ((int) Math.sqrt(temp + i) * (int) Math.sqrt(temp + i) == (temp + i)) {
				temp = temp + i;
			}
		}
		while ((int) Math.sqrt(temp) * (int) Math.sqrt(temp) == temp) {
			temp = (int) Math.sqrt(temp);
			count++;
		}
		return count;

	}
}
