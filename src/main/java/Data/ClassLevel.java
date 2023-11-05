package Data;

import Data.Basic.ClassSpecific.ClassSpecific;
import Data.Basic.SpellCasting;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassLevel {
    private CharacterClass character_class;
    private int level;
    private int ability_score_bonuses;
    private int prof_bonus;
    private List<Feature> features;
    private SpellCasting spellcasting;
    private ClassSpecific class_specific;

}
