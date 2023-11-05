package Data;

import Data.Basic.Prerequisite;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feature {

    private String name;
    private String desc;
    private CharacterClass character_class;
    private int level;
    private List<Prerequisite> prerequisites;

}
