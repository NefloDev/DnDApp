package Data;

import Data.Basic.Prerequisite;
import Data.Basic.Proficiency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiClassing {

    private List<Prerequisite> prerequisites;
    private List<Prerequisite> prerequisite_options;
    private List<Proficiency> proficiencies;
    private List<Proficiency> proficiency_choices;
    private int proficiency_choose;
    private int prerequisite_choose;

}
