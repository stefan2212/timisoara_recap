public class PizzaBuilder {

    private String name;
    private int size;
    private boolean hasMozzarella;
    private boolean hasOives;
    private boolean hasSallamy;
    private boolean hasCorn;
    private boolean hasSauce;

    public PizzaBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder size(int size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder mozzarella(boolean mozzarella) {
        this.hasMozzarella = mozzarella;
        return this;
    }

    public PizzaBuilder olives(boolean olives) {
        this.hasOives = olives;
        return this;
    }

    public PizzaBuilder salamy(boolean salamy) {
        this.hasSallamy = salamy;
        return this;
    }

    public PizzaBuilder corn(boolean corn) {
        this.hasCorn = corn;
        return this;
    }

    public PizzaBuilder sauce(boolean sauce) {
        this.hasSauce = sauce;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setName(this.name);
        pizza.setSize(this.size);
        pizza.setHasMozzarella(this.hasMozzarella);
        pizza.setHasCorn(this.hasCorn);
        pizza.setHasOives(this.hasOives);
        pizza.setHasSallamy(this.hasSallamy);
        pizza.setHasSauce(this.hasSauce);

        return pizza;
    }
}
