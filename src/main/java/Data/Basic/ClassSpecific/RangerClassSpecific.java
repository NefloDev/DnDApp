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
public class RangerClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.RANGER;

    private int favored_enemies;
    private int favored_terrain;

}
