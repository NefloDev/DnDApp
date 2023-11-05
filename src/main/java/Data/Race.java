package Data;

import Data.Basic.AbilityScore;
import Data.Basic.Proficiency;
import Data.Enums.Alignments;
import Data.Enums.Sizes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Race {

    private String name;
    private int speed;
    private Map<AbilityScore, Integer> ability_bonuses;
    private Alignments alignment;
    private String age;
    private Sizes size;
    private String size_description;
    private List<Proficiency> starting_proficiencies;
    private List<Proficiency> starting_proficiency_options;
    private int choose;
    private List<String> languages;
    private String language_desc;
    private List<Trait> traits;
    private List<SubRace> subraces;

}
