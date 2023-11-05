package Data.Basic.ClassSpecific.Abilities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatingSpellPoints {

    private int spell_slot_level;
    private int sorcery_point_cost;

}
