package square;

public class Square {
    //Data definition
    private int height, width, surfaceArea;
    
    //Square constructor which is also super class
    Square(int d){
        height = width = d;
    }
    
    //computeSurfaceArea method
    public void computeSurfaceArea(int w,int h){
        height = h;
        width = w;
        surfaceArea = height * width;
        System.out.println("Square Surface Area = " + surfaceArea);
    }
    
     //computePerimeter method    
    public void computePerimeter(){
        System.out.println("Square Perimeter = " + 2 * (height + width));
    }
    
}
