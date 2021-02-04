package arraytest;

public class arrayTest {
	public static void main(String[] args) {
		int array[] = new int[5];
		int k=0, sum = 0;
		for(int i=1; i<11; i++) {
			if(i%2 == 0) {
				array[k] = i;
				k++;
				continue;
			}
		}
		
		for(int a : array) {
			sum += a;
		}
		System.out.println("ÃÑ ÇÕÀº " + sum);
	}

}
