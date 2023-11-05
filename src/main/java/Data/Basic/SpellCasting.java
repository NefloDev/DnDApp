package Data.Basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpellCasting {
    private static final int LEVELS = 9;
    private int cantrips_known;
    private int spells_known;
    private int spell_slots_level_1;
    private int spell_slots_level_2;
    private int spell_slots_level_3;
    private int spell_slots_level_4;
    private int spell_slots_level_5;
    private int spell_slots_level_6;
    private int spell_slots_level_7;
    private int spell_slots_level_8;
    private int spell_slots_level_9;
}
