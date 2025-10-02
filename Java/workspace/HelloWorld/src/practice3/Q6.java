package practice3;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 로또 번호 생성기
//		크기 6의 배열에 1~45 사이의 난수를 넣어 로또 번호를 생성하세요. 
//		단, 중복 없는 난수여야 합니다
		int[] lottoArr = new int[6]; 
		for(int i=0; i<lottoArr.length; i++) {
			int lottoNum = (int)(Math.random()*45+1);
			boolean bool = false;
			for(int j=0; j<i; j++) {
				if(lottoArr[j] == lottoNum) {
					bool = true;
					break;
				}
			}
			// 중복되는 번호인경우 다시한번 랜덤 번호를 저장하도록 만드는 if문 
			if(bool) {
				i--;
				continue;
			}
			// 중복되지 않는 경우 번호를 배열에 저장하고 다음 반복으로 진행
			lottoArr[i] = lottoNum;
		}
		for(int i: lottoArr) {
			System.out.print(i+",");
		}
	}

}











