package square;

import java.util.Scanner;

public class ShowSquareCube {
    
    public static void main(String[] args){
        //Data Definition
        int w, h, d;
        Scanner in = new Scanner(System.in);
        
        //Accepting values
        System.out.println("Enter Depth");
        d = in.nextInt();
        
        System.out.println("Enter Width");
        w = in.nextInt();
        
        System.out.println("Enter Height");
        h = in.nextInt();
        
        //instantiating class object
        Cube obj = new Cube(d);
        obj.computeSurfaceArea(w, h);
        obj.computePerimeter();
        obj.computeSurfaceArea(w, h, d);
        obj.computeVolume();
    }
}
