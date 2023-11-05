package Data.Basic.ClassSpecific;

import Data.Basic.ClassSpecific.Abilities.SneakAttack;
import Data.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RogueClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.ROGUE;

    private SneakAttack sneak_attack;

}
