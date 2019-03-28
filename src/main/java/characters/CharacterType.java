package characters;

public enum CharacterType {

    HOBBIT("goodie"),
    DWARF("goodie"),
    ELF("goodie"),
    HUMAN("goodie"),
    WIZARD_GOOD("goodie"),
    WIZARD_BAD("baddie"),
    ORC("baddie"),
    GOBLIN("baddie"),
    TROLL("baddie"),
    RINGWRATIH("baddie"),
    GIANT("baddie"),
    DRAGON_BAD("baddie"),
    DRAGOON_GOOD("goodie"),
    GOLLUM("baddie");

    private final String side;

    CharacterType(String side){
        this.side = side;
    }

    public String getSide(){
        return this.side;
    }


}
