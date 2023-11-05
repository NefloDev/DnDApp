package Data;

import Data.Basic.Proficiency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trait {

    private String name;
    private String description;
    private List<Race> races;
    private List<SubRace> subRaces;
    private List<Proficiency> proficiencies;

}
