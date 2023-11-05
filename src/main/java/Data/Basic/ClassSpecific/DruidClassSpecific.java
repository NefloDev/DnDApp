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
public class DruidClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.DRUID;
    private int wild_shape_max_cr;
    private boolean wild_shape_swim;
    private boolean wild_shape_fly;

}
