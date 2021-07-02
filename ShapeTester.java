import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {

        ShapeContainer shapes = new ShapeContainer(); 
        Scanner scan = new Scanner(System.in);
        int selection;
        

        System.out.println("Welcome the Shape Tester. Please choose an option");

        do{

            System.out.println("\n--------------------------------------------------------");
            System.out.println("1. Create an empty set of shapes.");
            System.out.println("2. Add shape to the set.");
            System.out.println("3. Calculate and print the total area of the shapes.");
            System.out.println("4. Calculate and print the total perimeter of the shapes.");
            System.out.println("5. Print the all information of all shapes");
            System.out.println("6. Find the first shape with given location.");
            System.out.println("7. Remove all selected shapes.");
            System.out.println("8. Quit.");
            System.out.println("--------------------------------------------------------\n");

            selection = scan.nextInt();


            if(selection == 1){
                shapes = new ShapeContainer();
                System.out.println("\nThe empty set is created.");
            }
            else if(selection == 2){
                String name;

                System.out.println("\nType the name of the shape(type triangle, square, circle or rectangle) : ");
                name = scan.next();

                if(name.equalsIgnoreCase("square")){
                    int x;
                    int y;
                    int side;
                    System.out.println("\nPut the location and side informations of the square: ");
                    System.out.print("x: "); 
                    x = scan.nextInt();
                    System.out.print("y: "); 
                    y = scan.nextInt();                    
                    System.out.print("side: "); 
                    side = scan.nextInt();

                    Shape square = new Square(x,y,side);
                    shapes.add(square);
                    System.out.println("\nThe square is added to set.");

                }
                else if(name.equalsIgnoreCase("circle")){
                    
                    int x;
                    int y;
                    int radius;
                    System.out.println("\nPut the location and side informations of the circle: ");
                    System.out.print("x: "); 
                    x = scan.nextInt();
                    System.out.print("y: "); 
                    y = scan.nextInt();                    
                    System.out.print("radius: "); 
                    radius = scan.nextInt();

                    Shape circle = new Circle(x,y,radius);
                    shapes.add(circle);
                    System.out.println("\nThe circle is added to set.");

                }
                else if(name.equalsIgnoreCase("triangle")){

                    int x;
                    int y;
                    int ax, ay, bx, by, cx, cy;

                    System.out.println("\nPut the location informations of the triangle: ");
                    System.out.print("x location of the center: "); 
                    x = scan.nextInt();
                    System.out.print("y location of the center: "); 
                    y = scan.nextInt();                    
                    System.out.print("x location of first corner: "); 
                    ax = scan.nextInt();
                    System.out.print("y location of first corner: "); 
                    ay = scan.nextInt();
                    System.out.print("x location second corner: "); 
                    bx = scan.nextInt();
                    System.out.print("y location second corner: "); 
                    by = scan.nextInt();
                    System.out.print("x location of third corner: "); 
                    cx = scan.nextInt();
                    System.out.print("y location third corner: "); 
                    cy = scan.nextInt();

                    Shape triangle = new Triangle(x,y,ax, ay, bx, by,cx,cy);
                    if(((Triangle) triangle).getFirstSide() < ((Triangle) triangle).getSecondSide() + ((Triangle) triangle).getThirdSide() && ((Triangle) triangle).getSecondSide() < ((Triangle) triangle).getFirstSide() + ((Triangle) triangle).getThirdSide() && ((Triangle) triangle).getThirdSide() < ((Triangle) triangle).getSecondSide() + ((Triangle) triangle).getFirstSide()){
                        
                        shapes.add(triangle);
                        System.out.println("\nThe triangle is added to set.");
                    }
                    else{

                        System.out.println("This cannot be a triangle!");
                    }
                }
                else if(name.equalsIgnoreCase("rectangle")){

                    int x;
                    int y;
                    int width;
                    int height;

                    System.out.println("\nPut the location and side informations of the rectangle: ");
                    System.out.print("x: "); 
                    x = scan.nextInt();
                    System.out.print("y: "); 
                    y = scan.nextInt();                    
                    System.out.print("width: "); 
                    width = scan.nextInt();
                    System.out.print("height: "); 
                    height = scan.nextInt();

                    Shape rectangle = new Rectangle(x,y,width, height);
                    shapes.add(rectangle);
                    System.out.println("\nThe rectangle is added to set.");                  
                }
            }
            else if(selection == 3){ 
                System.out.println("Total area of the shapes in set: " + shapes.getArea());
            }
            else if(selection == 4){
                System.out.println("Total perimeter of the shapes in the set: " + shapes.getPerimeter());
            }
            else if(selection == 5){
                System.out.println(shapes);
            }
            else if(selection == 6){
                
                int x, y;
                
                System.out.print("Enter the x coordinate of the point you want to check : ");
                x = scan.nextInt();
                System.out.println();
                
                System.out.print("Enter the y coordinate of the point you want to check : ");
                y = scan.nextInt();
                System.out.println();

                boolean check = true;

                for (int i = 0; i < shapes.getSize() && check; i++) {
                    if (shapes.get(i).contains(x, y) != null) {
                        
                        shapes.get(i).setSelected(true);
                        System.out.println("The first shape contains the given point --> " + shapes.get(i) + "\n");
                        check = false;
                
                    } else if (i == shapes.getCurrentElementNumber() - 1 && shapes.get(i).contains(x, y) == null) 
                        System.out.println("There is no shape contains the given point..."+'\n');	
                }
            }

            else if( selection == 7){

                System.out.println("All selected shapes are removed from the set");
                for(int i = 0; i< shapes.getSize(); i ++){
                    if(shapes.get(i).getSelected())
                        shapes.remove(i);
                }
            }
            
        }while(selection != 8);

        scan.close();
        System.out.println("Goodbye.");
        
    }
    
}
