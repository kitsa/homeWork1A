package src;

class App{
    
    double meter2foot(double tmp){
        return 3.28084 * tmp;
    }
    
    double foot2meter(double tmp){
        return tmp / 3.28084;
    }
    
    double areaOfRectangle(double x, double y){
        return x * y;
    }
    
    double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }
    
    double volumeOfSphere(double radius){
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    public static void main(String [] args){
        double m2f = new App().meter2foot(10);
        System.out.print("10 meter = ");
        System.out.println(m2f);
        
        double f2m = new App().foot2meter(10);
        System.out.print("10 foot = ");
        System.out.println(f2m);
        
        double areaRec = new App().areaOfRectangle(5, 4);
        System.out.print("rectangle's area = ");
        System.out.println(areaRec);
        
        double areaCir = new App().areaOfCircle(10);
        System.out.print("circle's area = ");
        System.out.println(areaCir);
        
        double volume = new App().volumeOfSphere(10);
        System.out.print("volume = ");
        System.out.println(volume);
    }
}