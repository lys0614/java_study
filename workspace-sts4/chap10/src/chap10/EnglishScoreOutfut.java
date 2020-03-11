package chap10;

import java.util.Arrays;

class EnglishScore implements Comparable<EnglishScore>{

	String name;
	int score;
	
	EnglishScore(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name+"의 점수는 "+score+"이다";
	}

	@Override
	public int compareTo(EnglishScore o) {
		EnglishScore es = (EnglishScore)o;
		int result = 0;
		if(score > es.score) {
			result = 1;
		}
		else if(score == es.score) {
			result = 0;
		}
		else result = -1;
		
		return result;
	}

}

public class EnglishScoreOutfut {

	static EnglishScore findBest(EnglishScore[] a) {
		EnglishScore best = a[0];
		
		Arrays.sort(a);
		
		best = a[a.length-1];
	
		return best;
	}
	
	public static void main(String[] args) {
		
		
		EnglishScore[] esc = {new EnglishScore("김삿갓", 77), new EnglishScore("홍길동", 99), new EnglishScore("장영실", 88)};
		System.out.println("영어 최고 점수 : " + findBest(esc).toString());
		
	}

}