package Entities;

public class Rectangle {

    public double width;
    public double height;


    public double areaRec(){

   return width*height;

    }
    public double perimeterRec(){

        return 2*(width+height);

    }
    double diagonal;
    public double diagonalRec(){

       diagonal = (height*height) + (width * width);
        return Math.sqrt(diagonal);

    }
    public String toString(){

        return "AREA = " + areaRec()+ "\nPERIMETER = " + perimeterRec() + "\nDIAGONAL = " + diagonalRec() ;
    }

}
