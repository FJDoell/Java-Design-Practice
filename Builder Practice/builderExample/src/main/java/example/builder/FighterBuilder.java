package example.builder;

import example.model.Fighter;
import lombok.Getter;

@Getter
public class FighterBuilder
{
	private String name;
	private String alignment;
	private int hp;
	private int mp;
	private int stamina;
	// No need for max stat values, because those are set automatically in the Fighter constructor!
	// Builders are powerful! :)
	
	public FighterBuilder(String name, String alignment, int hp) {
		this.name = name;
		this.alignment = alignment;
		this.hp = hp;
	}
	public FighterBuilder setMp(int mp) {
		this.mp = mp;
		return this;
	}
	public FighterBuilder setStamina(int stamina) {
		this.stamina = stamina;
		return this;
	}
	
	public Fighter build() {
		Fighter fighter = new Fighter(this);
		return fighter;
	}
}
