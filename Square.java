public class Square extends Rectangle {
    int side;

    public Square(int x, int y, int side) {

        super(x,y, side, side);
        this.side = side;
    }

    public double getArea(){
        return super.getArea();
    }

    public double getPerimeter(){
        return super.getPerimeter();
    }

    @Override
    public String toString(){
        return "Square with x: " + getX() + ", y: " + getY() + " and side: " + side + "\nSelected: " + this.getSelected() +
        "\nArea: " + getArea() + ", perimeter: " + getPerimeter();
    }
    
    @Override 
    public boolean getSelected(){
        return isSelected;
    }

    @Override
    public boolean setSelected(boolean choice) {
        isSelected = choice;
        return choice;
    }
    
    @Override
    public Shape contains(int x, int y) {
        Square square = new Square(x, y, side);
        
        boolean xCheck = false;
        boolean yCheck = false;
        
        if(Math.abs(this.getX() - x) <= (side / 2))
            xCheck = true;
            
        if(Math.abs(this.getY() - y) <= (side / 2))
            yCheck = true;
            
        if(xCheck && yCheck)
            return square;

        return null;
    }
}
