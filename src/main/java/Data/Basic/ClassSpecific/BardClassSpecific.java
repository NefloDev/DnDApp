package Data.Basic.ClassSpecific;

import Data.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BardClassSpecific extends ClassSpecific{

    private static final String CHARACTER_CLASS = CharacterClass.BARD;
    private int bardic_inspiration_die;
    private int song_of_rest_die;
    private int magical_secrets_max_5;
    private int magical_secrets_max_7;
    private int magical_secrets_max_9;

}
