package characters;

public abstract class Character {

    private String name;
    private CharacterType type;

    public Character(String name, CharacterType type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public CharacterType getType(){
        return type;
    }

    public void setType(CharacterType type){
        this.type = type;
    }
}
