package basicquiz2;

import java.util.Random;

public class quiz10_1 {
	
		// 랜덤 3가지 수 제공
		int[] answer2;
		
		public quiz10_1() {
			answer2 = new int[3];
			Random ran = new Random();
		
			while((answer2[0]==answer2[1] || answer2[1]==answer2[2] || answer2[0]==answer2[2])) {
				for (int i=0; i < answer2.length; i++) {
					answer2[i] = ran.nextInt(1, 10);
				}
			}
	}
		
		public int[] getAnswer() {
			return answer2;
		}
		
		public int getLength() {
			return answer2.length;
		}
		
		public int getAnswerSingle(int i) {
			return answer2[i];
		}
		
		public static void main(String[] args) {	
			new quiz10_1();
		}
}
