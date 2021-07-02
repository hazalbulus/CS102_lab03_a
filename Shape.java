public abstract class Shape implements Locatable, Selectable {
    int x;
    int y;
    boolean isSelected;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
        isSelected = false;
    }

    abstract public double getArea();

    abstract public double getPerimeter();
    
}
