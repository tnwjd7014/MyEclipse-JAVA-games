package basicquiz2;

public class quiz10_2 {
		//플레이어 입력값 비교 및 결과 출력
	quiz10_1 rtn;
	int ball = 0;
	int strike = 0;
	int out = 0;
	
	public quiz10_2() {
		rtn = new quiz10_1();
		for (int i = 0; i < rtn.getLength(); i++) {
			System.out.println(rtn.getAnswerSingle(i));
		}
	}
	
	public void analysis(int[] inp) {
		this.ball = 0;
		this.strike = 0;
		this.out = 0;
		
	for (int i = 0; i<inp.length; i++) {
		int outCount = 0;
		for (int j = 0; j < rtn.getLength(); j++) {
			if(i==j && inp[i]==rtn.getAnswerSingle(j))strike++;
			if(i!=j && inp[i]==rtn.getAnswerSingle(j))ball++;
			if(inp[i]!=rtn.getAnswerSingle(j))outCount++;
		}
		if(outCount ==3)out++;
	}
	}
	public String getResult() {
		return "볼 : "+ball+" 스트라이크 : "+strike+" 아웃 : "+out;
	}
	
	public boolean isThreeStrike() {
		return (strike == 3)?true:false;
	}
}
