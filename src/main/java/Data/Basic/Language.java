package Data.Basic;

import Data.CharacterClass;
import Data.Enums.LanguageTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {

    private String name;
    private String description;
    private LanguageTypes type;
    private List<CharacterClass> typical_speaker;

}
