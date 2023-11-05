package Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterClass {

    public static final String BARBARIAN = "Barbarian";
    public static final String BARD = "Bard";
    public static final String CLERIC = "Cleric";
    public static final String DRUID = "Druid";
    public static final String FIGHTER = "Fighter";
    public static final String MONK = "Monk";
    public static final String PALADIN = "Paladin";
    public static final String RANGER = "Ranger";
    public static final String ROGUE = "Rogue";
    public static final String SORCERER = "Sorcerer";
    public static final String WARLOCK = "Warlock";
    public static final String WIZARD = "Wizard";

    private String name;
    private String description;
    private String hit_die;
    private ClassLevel class_levels;
    private MultiClassing multi_classing;

}
