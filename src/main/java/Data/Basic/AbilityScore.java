package Data.Basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbilityScore {

    private String name;
    private String description;

    public AbilityScore(String name) {
        this.name = name;
    }

}
