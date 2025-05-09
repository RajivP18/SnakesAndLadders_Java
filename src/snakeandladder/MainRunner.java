package snakeandladder;

import java.util.LinkedList;
import java.util.Queue;

public class MainRunner {
public static void main(String[] args) {
	
	Board board = new Board(10);
	board.ladder(8, 24);
	board.ladder(15, 44);
	board.ladder(21, 34);
	board.ladder(49, 69);
	board.ladder(51, 97);
	
	board.snake(99, 1);
	board.snake(50, 12);
	board.snake(34, 20);
	board.snake(73, 41);
	board.snake(84, 63);
	
	
	Player p1 = new Player("Virat");
	Player p2 = new Player("Rohit");
	Player p3 = new Player("Hardik");
	Player p4 = new Player("pant");
	
	Queue<Player> players = new LinkedList<>();
	
	players.offer(p1);
	players.offer(p2);
	players.offer(p3);
	players.offer(p4);
	
	Game game = new Game(board,players);
	
	game.play();
}
}
