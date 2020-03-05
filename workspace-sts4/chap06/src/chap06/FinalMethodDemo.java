package chap06;

public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorldChess w = new WorldChess();
		w.getFirstPlayer();
		
	}

}

class Chess{
	enum ChessPlayer{
		WHITE, BLACK
	}
	
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
	
}

class WorldChess extends Chess{
//	ChessPlayer getFirstPlayer();
	// getFirstPlayer() 메서드느느 final 메서드기 때문에 오버라이딩이 불가능함
}

