package Data.Basic.ClassSpecific;

import Data.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BarbarianClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.BARBARIAN;
    private int rage_count;
    private int rage_damage_bonus;
    private int brutal_critical_dice;

}
