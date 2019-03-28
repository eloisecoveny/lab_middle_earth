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

    public void reduceStockLevel(int usedAmount) {
        if(this.stockLevel >= usedAmount) {
            this.stockLevel -= usedAmount;
        }
    }

    public HealingToolType getType() {
        return type;
    }

    public double getEffectiveness(){
        return this.type.getEffectiveness();
    }

    public int getPrice(){
        return this.type.getPrice();
    }
}
