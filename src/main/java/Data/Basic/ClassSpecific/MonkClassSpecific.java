package Data.Basic.ClassSpecific;

import Data.Basic.ClassSpecific.Abilities.MartialArts;
import Data.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonkClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.MONK;

    private int ki_points;
    private int unarmored_movement;
    private MartialArts martial_arts;

}
