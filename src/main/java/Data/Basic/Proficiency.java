package Data.Basic;

import Data.CharacterClass;
import Data.Race;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proficiency {

    private String name;
    private String type;
    private List<CharacterClass> classes;
    private List<Race> races;

}
