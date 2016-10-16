
// @author Pratik

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Game {

	private List<Dice> dice;
	private List<DiceValue> values;
	
	public Game(Dice die1, Dice die2, Dice die3) {
		if (die1 == null || die2 == null || die3 == null) throw new IllegalArgumentException("Dice cannot be null.");
		dice = new ArrayList<>();
		dice.add(die1);
		dice.add(die2);
		dice.add(die3);
		values = new ArrayList<>();
	}

	public List<DiceValue> getDiceValues() {
		values.clear();
                dice.stream().forEach((d) -> {
                    values.add(d.getValue());
            });
		return Collections.unmodifiableList(values);
	}	
	
	public int playRound(Player player, DiceValue pick, int bet ) {		
		if (player == null) throw new IllegalArgumentException("Player cannot be null.");
		if (pick == null) throw new IllegalArgumentException("Pick cannot be negative.");
		if (bet < 0) throw new IllegalArgumentException("Bet cannot be negative.");
		
		
		    
		int matches = 0;
                matches = dice.stream().map((d) -> {
                    d.roll();
                return d;
            }).filter((d) -> (d.getValue().equals(pick))).map((_item) -> 1).reduce(matches, Integer::sum);
		
		int winnings = matches * bet;

		if (matches > 0) {			
			player.receiveWinnings(winnings);
		}
		else {
			player.takeBet(bet); 
		}
        return winnings;		
	}
	
}