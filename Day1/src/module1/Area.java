package module1;

public class Area {
	void calArea(float x, float y)
    {
        System.out.println("Area of the rectangle: "+x*y+" units");
    }
	void calArea(float x)
    {
        System.out.println("Area of the square: "+x*x+"units");
    }
    
    void calArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" units");
    }
    public static void main(String args[]){
       Area obj = new Area();
	 obj.calArea(11,12);
	 obj.calArea(10);
	 obj.calArea(2.5);
    }
} 


