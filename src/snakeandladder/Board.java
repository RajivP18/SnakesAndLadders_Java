package snakeandladder;

import java.util.HashMap;
import java.util.Map;

public class Board {
	private int size;
	private Map<Integer, Integer> snakes;//head and tail
	private Map<Integer, Integer> ladders;//start and end
	
	public Board(int size) {
		this.size = size;
		this.snakes = new HashMap<>();
		this.ladders = new HashMap<>();
	}
	
	public void snake(int head, int tail) {
		snakes.put(head, tail);
	}
	public void ladder(int start, int end) {
		ladders.put(start, end);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Map<Integer, Integer> getSnakes() {
		return snakes;
	}

	public void setSnakes(Map<Integer, Integer> snakes) {
		this.snakes = snakes;
	}

	public Map<Integer, Integer> getLadders() {
		return ladders;
	}

	public void setLadders(Map<Integer, Integer> ladders) {
		this.ladders = ladders;
	}
	
	
}