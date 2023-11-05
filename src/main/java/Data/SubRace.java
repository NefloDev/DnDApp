package Data;

import Data.Basic.AbilityScore;
import Data.Basic.Language;
import Data.Basic.Proficiency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubRace {

    private String name;
    private String description;
    private Race race;
    private Map<AbilityScore, Integer> ability_bonus;
    private List<Proficiency> starting_proficiencies;
    private List<Language> languages;
    private List<Language> language_options;
    private List<Trait> racial_traits;

}
