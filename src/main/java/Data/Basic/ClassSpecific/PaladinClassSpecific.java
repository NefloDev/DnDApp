package Data.Basic.ClassSpecific;

import Data.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaladinClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.PALADIN;

    private int aura_range;

}
