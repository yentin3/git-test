
public class Min_Max {

	public static void main(String[] args)
	{
		int[] A= {1, 4, -3, 4};
        System.out.println(Min(A, 4));
        System.out.println("Hello GitHub check slave branch!");
        System.out.println("Hello GitHub checkout test branch!");
	}
	public static int  Min(int[] A, int n)
	{
		int min = A[0];
		for(int i = 1; i < n; i++) {
            if(min > A[i]) {
                min = A[i];
            }
        }
		return min;
	}
	
	public static int Max(int[] A, int n)
	{
		int max = A[0];
		for(int i = 1; i < n; i++) {
            if(max <A[i]) {
                max = A[i];
            }
        }
		return max;
	}
}
