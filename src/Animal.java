public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();

    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
