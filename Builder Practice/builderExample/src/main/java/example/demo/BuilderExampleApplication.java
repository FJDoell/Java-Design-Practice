package example.demo;

import example.builder.FighterBuilder;
import example.model.Fighter;

public class BuilderExampleApplication {

	public static void main(String[] args) {
		// Here we are creating our fighters!
		Fighter fighter1 = 
				new FighterBuilder("Meta Knight", "Neutral", 600)
				.setMp(200)
				.setStamina(600)
				.build();
		Fighter fighter2 =
				new FighterBuilder("Kirby", "Good", 500)
				.setStamina(300)
				.build();
		Fighter fighter3 =
				new FighterBuilder("King Dedede", "Evil", 1000)
				.build();
		
		System.out.println(fighter1);
		System.out.println(fighter2);
		System.out.println(fighter3);
	}
}
