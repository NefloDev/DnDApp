package Data.Basic.ClassSpecific;

import Data.Basic.ClassSpecific.Abilities.CreatingSpellPoints;
import Data.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SorcererClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.SORCERER;

    private int sorcery_points;
    private int metamagic_known;
    private CreatingSpellPoints creating_spell_slots;

}
