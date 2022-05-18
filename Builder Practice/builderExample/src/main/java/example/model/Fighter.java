package example.model;

import example.builder.FighterBuilder;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Fighter {
	private String name;
	private String alignment;
	private int hp;
	private int maxHp;
	private int mp;
	private int maxMp;
	private int stamina;
	private int maxStamina;

	// Note the lack of "name" and "max" setters! 
	// After the builder constructs this class,
	// they are no longer accessible.
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	public Fighter(FighterBuilder builder) {
		this.name = builder.getName();
		this.alignment = builder.getAlignment();
		this.hp = builder.getHp();
		this.maxHp = builder.getHp();
		this.mp = builder.getMp();
		this.maxMp = builder.getMp();
		this.stamina = builder.getStamina();
		this.maxStamina = builder.getStamina();
	}
	@Override
	public String toString() {
		return "--" + name + "'s Stats" + "--\n"
				+ "alignment: " + alignment + "\n"
				+ "hp=" + hp + "\n"
				+ "maxHp=" + maxHp + "\n"
				+ "mp=" + mp + "\n"
				+ "maxMp=" + maxMp + "\n"
				+ "stamina=" + stamina + "\n"
				+ "maxStamina=" + maxStamina + "\n";
	}
}
