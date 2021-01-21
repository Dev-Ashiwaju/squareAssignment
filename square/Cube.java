package square;

public class Cube extends Square {
    
    private int depth, surfaceArea;
   //Cube constrcutor 
    Cube(int d) {
        super(d);
        depth = d;
    }
   
   //Overloade computeSurfaceArea method
    public void computeSurfaceArea(int w,int h, int d){
        surfaceArea = 6 * d * d;
        System.out.println("Cube Surface Area = " + surfaceArea);
    }
    
    //computeVolume method
    public void computeVolume(){
        System.out.println("Cube Volume = " + Math.pow(depth, 3));
    }
}
