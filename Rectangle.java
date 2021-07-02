public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.height= height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
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
    public String toString(){
        return "Rectangle with x: " + getX() + ", y: " + getY() + ", width: " + width + " and height: " + height + "\nSelected: " + this.getSelected() + 
        "\nArea: " + getArea() + ", perimeter: " + getPerimeter();
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
        Rectangle rectangle = new Rectangle(x, y, width, height);
        
        boolean xCheck = false;
        boolean yCheck = false;
        
        if(Math.abs(this.getX() - x) <= (width / 2))
            xCheck = true;
            
        if(Math.abs(this.getY() - y) <= (height / 2))
            yCheck = true;
            
        if(xCheck && yCheck)
            return rectangle;

        return null;
    }

    
}
