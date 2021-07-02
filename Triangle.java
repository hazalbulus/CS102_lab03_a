public class Triangle extends Shape {
    double a;
    double b;
    double c;
    int ax, bx, cx, ay, by, cy;

    public Triangle(int x, int y, int ax, int ay, int bx, int by, int cx, int cy)
    {
        super(x, y);
        this.ax = ax;
        this.ay = ay; 
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.a = (int) Math.sqrt((ax-bx)*(ax-bx) + (ay-by)*(ay-by));
        this.b = (int) Math.sqrt((bx-cx)*(bx-cx) + (by-cy)*(by-cy));
        this.c = (int) Math.sqrt((ax-cx)*(ax-cx) + (ay-cy)*(ay-cy));
    }

    public double getFirstSide(){
        return a;
    }
    public double getSecondSide(){
        return b;
    }
    
    public double getThirdSide(){
        return c;
    }
    

    @Override
    public double getArea() {
        double area;
        double semiPerimeter;

        semiPerimeter = (a + b + c) / 2;
        area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        return area;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
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
        return "Triangle with center point : (" + getX() + ", " + getY() + ") , first side: " + a + ", second side: " + b + " and third side: " + c + "\nSelected: " + this.getSelected() + 
        "\nArea: " + getArea() + ", perimeter: " + getPerimeter();
    }


    @Override
    public Shape contains(int x, int y) {

        double det = (bx - ax) * (cy - ay) - (by - ay) * (cx - ax);

        if(det * ((bx - ax) * (y - ay) - (by - ay) * (x - ax)) > 0 &&
        det * ((cx - bx) * (y - by) - (cy - by) * (x - bx)) > 0 &&
        det * ((ax - cx) * (y - cy) - (ay - cy) * (x - cx)) > 0 )
            return  this;

        return null;
        }


    @Override
    public boolean setSelected(boolean choice) {
        isSelected = choice;
        return choice;
    }

    @Override
    public boolean getSelected() {
        return isSelected;
    }
}
