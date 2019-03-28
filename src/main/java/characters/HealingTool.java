package characters;

public class HealingTool {

    private int stockLevel;
    private HealingToolType type;

    public HealingTool(HealingToolType type){
        this.stockLevel = 100;
        this.type = type;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public HealingToolType getType() {
        return type;
    }
}
