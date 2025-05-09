package snakeandladder;

import java.util.Queue;

public class Game {

	private Dice dice;
	private Board board;
	private Queue<Player> players;

	public Game(Board board, Queue<Player> players) {
		this.board = board;
		this.players = players;
		this.dice = new Dice();
	}

	public void play() {
	    while (true) {
	        Player current = players.poll();
	        if (current == null) {
	            break; // No players left
	        }

	        int roll = dice.roll();
	        int oldPosition = current.getPosition();
	        int next = oldPosition + roll;

	        if (next > board.getSize() * board.getSize()) {
	            System.out.println("Hey " + current.getName() + ", you rolled too high and can't move.");
	            players.offer(current);
	        } else if (next == board.getSize() * board.getSize()) {
	            System.out.println("🎉 The winner is " + current.getName() + "!");
	            break;
	        } else {
	            if (board.getSnakes().containsKey(next)) {
	                System.out.println("Oh no! " + current.getName() + " got bitten by a snake.");
	                next = board.getSnakes().get(next);
	            } else if (board.getLadders().containsKey(next)) {
	                System.out.println("Yay! " + current.getName() + " climbed a ladder.");
	                next = board.getLadders().get(next);
	            }

	            current.setPosition(next);
	            System.out.println(current.getName() + " has moved from " + oldPosition + " to " + next);
	            players.offer(current);
	        }

	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt(); // Restore interrupted state
	            System.out.println("Game interrupted.");
	            break;
	        }
	    }
	}
}