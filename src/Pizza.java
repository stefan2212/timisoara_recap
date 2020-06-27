public class Pizza {

    private String name;
    private int size;
    private boolean hasMozzarella;
    private boolean hasOives;
    private boolean hasSallamy;
    private boolean hasCorn;
    private boolean hasSauce;

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasMozzarella() {
        return hasMozzarella;
    }

    public void setHasMozzarella(boolean hasMozzarella) {
        this.hasMozzarella = hasMozzarella;
    }

    public boolean isHasOives() {
        return hasOives;
    }

    public void setHasOives(boolean hasOives) {
        this.hasOives = hasOives;
    }

    public boolean isHasSallamy() {
        return hasSallamy;
    }

    public void setHasSallamy(boolean hasSallamy) {
        this.hasSallamy = hasSallamy;
    }

    public boolean isHasCorn() {
        return hasCorn;
    }

    public void setHasCorn(boolean hasCorn) {
        this.hasCorn = hasCorn;
    }

    public boolean isHasSauce() {
        return hasSauce;
    }

    public void setHasSauce(boolean hasSauce) {
        this.hasSauce = hasSauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", hasMozzarella=" + hasMozzarella +
                ", hasOives=" + hasOives +
                ", hasSallamy=" + hasSallamy +
                ", hasCorn=" + hasCorn +
                ", hasSauce=" + hasSauce +
                '}';
    }
}
