public abstract class Tile {

    protected int position;
    protected String type;

    public Tile(int position, String type) {
        this.position = position;
        this.type = type;
    }

    public abstract void applyEffect(Player player);
    
}
