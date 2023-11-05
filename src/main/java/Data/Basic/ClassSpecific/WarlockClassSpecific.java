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
public class WarlockClassSpecific extends ClassSpecific {

    private static final String CHARACTER_CLASS = CharacterClass.WARLOCK;

    private int invocations_known;
    private int mystic_arcanum_level_6;
    private int mystic_arcanum_level_7;
    private int mystic_arcanum_level_8;
    private int mystic_arcanum_level_9;

}
