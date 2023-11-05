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
public class FighterClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.FIGHTER;

    private int action_surges;
    private int indomitable_uses;
    private int extra_attacks;

}
