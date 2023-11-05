package Data.Basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prerequisite {

    private AbilityScore ability_score;
    private int minimum_score;

}
