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
public class ClericClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.CLERIC;
    private int channel_divinity_charges;
    private int destroy_undead_cr;

}
