package com.service.effect.effectRelated;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Elements;
import com.model.Restrictions;
import com.model.character.CharacterModel;
import com.model.effects.resists.ElementResistance;
import com.service.MessageService;
import com.service.global.GlobalSettingService;

/**
 * Handles damaging a target and checking for restrictions related to damage.
 * Restrictions used are listed below:
 * NO_DAMAGE, CANNOT_MOVE, CANNOT_BE_ATTACKED, CANNOT_BE_HEALED, CAN_BE_REVIVED
 * 
 * @author darkm
 *
 */
@Service
public class DamageService {
	
	@Autowired
	GlobalSettingService globalSettings;

	@Autowired
	MessageService messageServ;
	
	@Autowired
	ElementService elementServ;

	public CharacterModel dealDamage(CharacterModel c, Set<Elements> elements, int damage) {
		if (!c.getRestrictions().contains(Restrictions.NO_DAMAGE)) {
			damage = calculateResistance(c.getNatResistances())
			damage = elementServ.checkAllElements(damage, c.getNatResistances(), damage);
			if(damage <= globalSettings.getMINIMUM_DAMAGE())
				damage = globalSettings.getMINIMUM_DAMAGE();
			if(damage >= globalSettings.getMAX_DAMAGE())
				damage = globalSettings.getMAX_DAMAGE();
			c.setHp(c.getHp() - damage);
		}
		return c;
	}
	
	public int calculateResistance(Set<ElementResistance> resistSet, Set<Elements> elements, int damage) {
		
		return damage;		
	}
}
