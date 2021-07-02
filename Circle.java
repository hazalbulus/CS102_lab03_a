public class Circle extends Shape {

    int radius;

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle with x: " + getX() + ", y: " + getY() + " and radius: " + radius + "\nSelected: " + this.getSelected() + 
        "\nArea: " + getArea() + ", perimeter: " + getPerimeter();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean getSelected() {
        return isSelected;
    }

    @Override
    public boolean setSelected(boolean choice) {
        isSelected = choice;
        return choice;
    }

    @Override
    public Shape contains(int x, int y) {
        Circle circle = new Circle(x,y,radius);
        double distance;
        distance = Math.sqrt ( Math.pow ( Math.abs (this.getX() - x) , 2) + Math.pow (Math.abs (this.getY() - y) , 2));
        
        if(distance < radius)
            return circle;

        return null;
        
    }
    
}
