import java.util.ArrayList;

public class ShapeContainer {

    ArrayList<Shape> shapes;

    public ShapeContainer(){
        shapes = new ArrayList<>();
    }


    public void add(Shape s){
        shapes.add(s);

    }

    public double getArea(){
        double totalArea;
        totalArea = 0;
        for(int i = 0; i < shapes.size(); i++ ){
            totalArea += shapes.get(i).getArea();

        }
        return totalArea;
    }

    public double getPerimeter(){
        double totalPerimeter;
        totalPerimeter = 0;
        for(int i = 0; i < shapes.size(); i++){
            totalPerimeter += shapes.get(i).getPerimeter();

        }
        return totalPerimeter;
    }    

    @Override
    public String toString(){
        String result;
        result = "";
        for(int i = 0; i < shapes.size(); i++){
            result += "\n" + shapes.get(i).toString() +"\n";
        }        
        return result;
    }

    public Shape get(int i){
        return shapes.get(i);
    }

    public int getSize(){
        return shapes.size();
    }

    public int getCurrentElementNumber(){
        int current =0;
        for(int i = 0; i< shapes.size(); i++){
            if(shapes.get(i) != null)
                current++;
        }
        return current;
    }

    public void remove(int i){
        shapes.remove(i);

    }
}
