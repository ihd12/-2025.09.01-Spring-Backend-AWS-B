package practice3;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			boolean dup = false; 
			for(int j=0; j<i; j++) {
				if(lotto[j]==random) {
					dup = true;
					break;
				}
			}
			if(dup==false) {
				lotto[i]=random;
			}
		}
		for(int i:lotto) {
			System.out.println(i);
		}
	}

}
