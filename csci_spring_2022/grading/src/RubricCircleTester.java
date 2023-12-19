import java.lang.reflect.Method;

//*******************************************************
// RubricCircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
//
//*******************************************************
public class RubricCircleTester{
     
     
    private static double error = 0.0;  // for some tests, this can be adjusted (in case rounding causes slight differences in output). 
     
    private static Circle circleGen(double x, double y, double rad)
    {
    	Circle rc = new Circle();
    	rc.setX(x);
    	rc.setY(y);
    	rc.setRadius(rad);
    	return rc;
    }
    public static boolean unitCircleTest()
    {
    	System.out.println("Unit Circle Test:");
    	Method isUnitCircleMethod = null;
    	
    	//check to see if the methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	try {
			isUnitCircleMethod = Circle.class.getMethod("isUnitCircle", (Class<?> []) null);
		} catch (NoSuchMethodException e) {}
    	
    	if (isUnitCircleMethod == null){
    		System.out.println("\tisUnitCircle method doesn't exist");
    		return false;
    	}

    	try{
        Circle circle1= circleGen(1,1,1);  // not a unit circle
        Circle circle2= circleGen(0,0,1);  // a unit circle
        Circle circle3= circleGen(5,6,10); // not a unit circle
	    	
        boolean testA = (false == circle1.isUnitCircle());
        boolean testB = (true == circle2.isUnitCircle());
        boolean testC = (false == circle3.isUnitCircle());
	    
        System.out.println("\tTest Passed: " + testA + "\t(1,1,1) is a unit circle: " + (boolean)isUnitCircleMethod.invoke(circle1, (Object [])null));
        System.out.println("\tTest Passed: " + testB + "\t(0,0,1) is a unit circle: " + (boolean)isUnitCircleMethod.invoke(circle2, (Object [])null));
        System.out.println("\tTest Passed: " + testC + "\t(5,6,10) is a unit circle: " + (boolean)isUnitCircleMethod.invoke(circle3, (Object [])null));
                 
        return testA && testB && testC;
    	}catch (Exception e){return false;}
    }
 
     
    public static boolean xTest()
    {
    	
    	System.out.println("Getting/Setting x:");
    	Method getXMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	
    	try {
			getXMethod = Circle.class.getMethod("getX", (Class<?> []) null);
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (getXMethod == null){
    		System.out.println("\tgetX method doesn't exist");
    		return false;
    	}
    	
    	try{
        double x;
        double xReturn;
        Circle circle= circleGen(20, 1, 1);
   
        x = 1.0;
        circle.setX(x);
        xReturn =  circle.getX();
        boolean testA =   (x == xReturn);
        System.out.println("\tTest Passed: " + testA + "\tvalue set: " + x + " x returned: " + xReturn);
         
        x = -1.0;
        circle.setX(x);
        xReturn =  circle.getX();
	    boolean testB =   (x == xReturn);
        System.out.println("\tTest Passed: " + testB + "\tvalue set: " + x + " x returned: " + xReturn);
 
        x = 0.0;
        circle.setX(x);
        xReturn =  circle.getX();
	    boolean testC =   (x == xReturn);
        System.out.println("\tTest Passed: " + testC + "\tvalue set: " + x + " x returned: " + xReturn);
 
 
        x = 1138.25;
        circle.setX(x);
        xReturn =  circle.getX();
	    boolean testD =   (x == xReturn);
        System.out.println("\tTest Passed: " + testD + "\tvalue set: " + x + " x returned: " + xReturn);
 
        return testA && testB && testC && testD;
    	}catch(Exception e){return false;}
    }
     
 
    public static boolean yTest()
    {
    	System.out.println("Getting/Setting y:");
    	Method getYMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	try {
			getYMethod = Circle.class.getMethod("getY", (Class<?> []) null);
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (getYMethod == null){
    		System.out.println("\tgetY method doesn't exist");
    		return false;
    	}
    	
    	try{
        double y;       
        double yReturn;
        Circle circle= new Circle();
        circle.setX(20);
        circle.setY(1.0);
        circle.setRadius(1.0);

         
        y = 1.0;
        circle.setY(y);
        yReturn =  circle.getY();
	    boolean testA =   (y == yReturn);
        System.out.println("\tTest Passed: " + testA + "\tvalue set: " + y + " y returned: " + yReturn);
         
 
        y = -1.0;
        circle.setY(y);
        yReturn =  circle.getY();
        boolean testB =   (y == yReturn);
        System.out.println("\tTest Passed: " + testB + "\tvalue set: " + y + " y returned: " + yReturn);
         
        y = 0.0;
        circle.setY(y);
        yReturn =  circle.getY();
        boolean testC =   (y == yReturn);
        System.out.println("\tTest Passed: " + testC + "\tvalue set: " + y + " y set returned: " + yReturn);
 
        y = 1000.80;
        circle.setY(y);
        yReturn =  circle.getY();
        boolean testD =   (y == yReturn);
        System.out.println("\tTest Passed: " + testD + "\tvalue set: " + y + " y returned: " + yReturn);
 
        return testA && testB && testC && testD;
    	}catch (Exception e){return false;}
    }
         
    public static boolean radiusTest()
    {
    	System.out.println("Getting/Setting radius:");
    	Method getRadiusMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	try {
			getRadiusMethod = Circle.class.getMethod("getRadius", (Class<?> []) null);
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (getRadiusMethod == null){
    		System.out.println("\tgetRadius method doesn't exist");
    		return false;
    	}
    	
    	try{
        double radius;      
        double radiusReturn;
        Circle circle= new Circle();
        circle.setX(20);
        circle.setY(1.0);
        circle.setRadius(1.0);
	     
        radius = 1.0;
        circle.setRadius(radius);
        radiusReturn =  circle.getRadius();
        boolean testA =   (radius == radiusReturn);
        System.out.println("\tTest Passed: " + testA + "\tvalue set: " + radius + " radius returned: " + radiusReturn);
         
        radius = -1.0;
        circle.setRadius(radius);
        radiusReturn =  circle.getRadius();
        boolean testB =   (radius != radiusReturn);
        System.out.println("\tTest Passed: " + testB + "\tvalue set: " + radius + " radius returned: " + radiusReturn);
  
        radius = 0.0;
        circle.setRadius(radius);
        radiusReturn =  circle.getRadius();
        boolean testC =   (radius == radiusReturn);
        System.out.println("\tTest Passed: " + testC + "\tvalue set: " + radius + " radius returned: " + radiusReturn);
 
        radius = 99.50;
        circle.setRadius(radius);
        radiusReturn =  circle.getRadius();
        boolean testD =   (radius == radiusReturn);
        System.out.println("\tTest Passed: " + testD + "\tvalue set: " + radius + " radius returned: " + radiusReturn);
 
        return testA && testB && testC && testD;
    	}catch(Exception e){return false;}
    }
     
    public static double distance(double x, double y, double  x2, double  y2)
    {
        return Math.sqrt((x - x2)* (x - x2) + (y - y2)* (y - y2));
    }
     
    public static boolean distanceTest()
    {
    	System.out.println("Distance Test:");
    	Method distanceMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	try {
			distanceMethod = Circle.class.getMethod("distance", new Class [] { Circle.class });
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (distanceMethod == null){
    		System.out.println("\tdistance method doesn't exist");
    		return false;
    	}
    	
    	try{
        double x1 = 0.0, y1 = 0.0, r1 = 1.0;
        double x2 = 0.0, y2 = 10.0, r2 = 1.0;
         
        Circle circle1;
        Circle circle2;
                 
        double distance;
        double referenceDistance;

        circle1 = new Circle();
        circle1.setX(x1);
        circle1.setY(y1);
        circle1.setRadius(r1);
        
        circle2 = new Circle();
        circle2.setX(x2);
        circle2.setY(y2);
        circle2.setRadius(r2);
        
        distance = circle1.distance(circle2);
        referenceDistance = distance(x1,y1,x2,y2);
        boolean testA = (Math.abs(distance-referenceDistance) <= error);
        System.out.println("\tTest Passed: " + testA +"\texpected: " + referenceDistance + " found: " + distance);
         
        x2 = 10;
        circle1 = new Circle();
        circle1.setX(x1);
        circle1.setY(y1);
        circle1.setRadius(r1);
        
        circle2 = new Circle();
        circle2.setX(x2);
        circle2.setY(y2);
        circle2.setRadius(r2);
        
        distance = circle1.distance(circle2);
        referenceDistance = distance(x1,y1,x2,y2);
        boolean testB = (Math.abs(distance-referenceDistance) <= error);
        System.out.println("\tTest Passed: " + testB +"\texpected: " + referenceDistance + " found: " + distance);
     
        x2 = 0;
        y2 = 0;
        circle1 = new Circle();
        circle1.setX(x1);
        circle1.setY(y1);
        circle1.setRadius(r1);
        
        circle2 = new Circle();
        circle2.setX(x2);
        circle2.setY(y2);
        circle2.setRadius(r2);
        
        distance = circle1.distance(circle2);
        referenceDistance = distance(x1,y1,x2,y2);
        boolean testC = (Math.abs(distance-referenceDistance) <= error);
        System.out.println("\tTest Passed: " + testC +"\texpected: " + referenceDistance + " found: " + distance);
         
        x1 = 20;
        y1 = 20;
        x2 = 25;
        y2 = 32;
        circle1 = new Circle();
        circle1.setX(x1);
        circle1.setY(y1);
        circle1.setRadius(r1);
        circle2 = new Circle();
        circle2.setX(x2);
        circle2.setY(y2);
        circle2.setRadius(r2);
        
        //distance = circle1.distance(circle2);
        distance = (double)distanceMethod.invoke(circle1, new Object [] { circle2 });
        referenceDistance = distance(x1,y1,x2,y2);
        boolean testD = (Math.abs(distance-referenceDistance) <= error);
        System.out.println("\tTest Passed: " + testD +"\texpected: " + referenceDistance + " found: " + distance);
                 
        return testA && testB && testC && testD;
    	}catch (Exception e){return false;}
    }
     
    private static double referenceArea(double r)
    {
        return Math.PI * r*r;
    }
     
    public static boolean areaTest()
    {
    	System.out.println("Area Test:");
    	Method areaMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	try {
			areaMethod = Circle.class.getMethod("area", (Class<?> [])  null );
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (areaMethod == null){
    		System.out.println("\tarea method doesn't exist");
    		return false;
    	}
    	
    	try{
        Circle circle;
                 
        double area;
        double referenceArea;
 
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(1);
        	
        //area = circle.area();
        area = (double)areaMethod.invoke(circle, (Object []) null);
        referenceArea = referenceArea(1);
        boolean testA = (Math.abs(area-referenceArea) <= error);
        System.out.println("\tTest Passed: " + testA +"\texpected: " + referenceArea + " found: " + area);
 
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(10);
        
        //area = circle.area();
        area = (double)areaMethod.invoke(circle, (Object []) null);
        referenceArea = referenceArea(10);
        boolean testB = (Math.abs(area-referenceArea) <= error);
        System.out.println("\tTest Passed: " + testB +"\texpected: " + referenceArea + " found: " + area);
 
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(100);
	    
        //area = circle.area();
        area = (double)areaMethod.invoke(circle, (Object []) null);
        referenceArea = referenceArea(100);
        boolean testC = (Math.abs(area-referenceArea) <= error);
        System.out.println("\tTest Passed: " + testC +"\texpected: " + referenceArea + " found: " + area);
 
                         
        return testA && testB && testC;
    	}catch (Exception e){return false;}
    }
     
    private static double referencePerimeter(double r)
    {
        return 2*Math.PI * r;
    }
     
    public static boolean perimeterTest()
    {
    	System.out.println("Perimeter Test:");
    	Method perimeterMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	try {
			perimeterMethod = Circle.class.getMethod("perimeter", (Class<?> [])  null );
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	
    	if (perimeterMethod == null){
    		System.out.println("\tperimeter method doesn't exist");
    		return false;
    	}
 
    	try{
        Circle circle;
                 
        double perimeter;
        double referencePerimeter;
 
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(0.5);
        
        //perimeter = circle.perimeter();
        perimeter = (double)perimeterMethod.invoke(circle, (Object []) null);
        referencePerimeter = referencePerimeter(0.5);
        boolean testA = (Math.abs(perimeter-referencePerimeter) <= error);
        System.out.println("\tTest Passed: " + testA +"\texpected: " + referencePerimeter + " found: " + perimeter);
 
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(0.05);
        //perimeter = circle.perimeter();
        perimeter = (double)perimeterMethod.invoke(circle, (Object []) null);
        referencePerimeter = referencePerimeter(0.05);
        boolean testB = (Math.abs(perimeter-referencePerimeter) <= error);
        System.out.println("\tTest Passed: " + testB +"\texpected: " + referencePerimeter + " found: " + perimeter);
 
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(0.005);
        //perimeter = circle.perimeter();
        perimeter = (double)perimeterMethod.invoke(circle, (Object []) null);
        referencePerimeter = referencePerimeter(0.005);
        boolean testC = (Math.abs(perimeter-referencePerimeter) <= error);
        System.out.println("\tTest Passed: " + testC +"\texpected: " + referencePerimeter + " found: " + perimeter);
                
        return testA && testB && testC;
    	}catch (Exception e){return false;}
    }
  
    private static double referenceDiameter(double r)
    {
        return 2*r;
    }
     
    public static boolean diameterTest()
    {
    	System.out.println("Diameter Test:");
    	
    	Method diameterMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(setXYRadAllExist() == false)
    		return false;
    	try {
			diameterMethod = Circle.class.getMethod("diameter", (Class<?> [])  null );
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (diameterMethod == null){
    		System.out.println("\tdiameter method doesn't exist");
    		return false;
    	}
    	
    	try{
        Circle circle;
 
        double radius;
        double diameter;
        double referenceDiameter;

        radius = 1;
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(radius);
        //diameter = circle.diameter();
        diameter = (double)diameterMethod.invoke(circle, (Object []) null);
        referenceDiameter = referenceDiameter(radius);
        boolean testA = (Math.abs(diameter-referenceDiameter) <= error);
        System.out.println("\tTest Passed: " + testA +"\texpected: " + referenceDiameter + " found: " + diameter);
 
        radius = 2;
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(radius);
        //diameter = circle.diameter();
        diameter = (double)diameterMethod.invoke(circle, (Object []) null);
        referenceDiameter = referenceDiameter(radius);
        boolean testB = (Math.abs(diameter-referenceDiameter) <= error);
        System.out.println("\tTest Passed: " + testB +"\texpected: " + referenceDiameter + " found: " + diameter);
 
        radius = 10;
        circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setRadius(radius);
        //diameter = circle.diameter();
        diameter = (double)diameterMethod.invoke(circle, (Object []) null);
        referenceDiameter = referenceDiameter(radius);
        boolean testC = (Math.abs(diameter-referenceDiameter) <= error);
        System.out.println("\tTest Passed: " + testC +"\texpected: " + referenceDiameter + " found: " + diameter);
                 
        return testA && testB && testC;
    	}catch (Exception e){return false;}
    }
 
    public static boolean intersectsTest()
    {
    	System.out.println("Intersection Test:");
    	Method intersectMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(!setXYRadAllExist())
    		return false;
    	try {
			intersectMethod = Circle.class.getMethod("intersects", new Class [] { Circle.class } );
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (intersectMethod == null){
    		System.out.println("\tintersects method doesn't exist");
    		return false;
    	}
    	
    	try{
        Circle circle1= new Circle();
        circle1.setX(0);
        circle1.setY(1);
        circle1.setRadius(1);
        
        Circle circle2= new Circle();
        circle2.setX(1);
        circle2.setY(0);
        circle2.setRadius(1);
        
        Circle circle3= new Circle();
        circle3.setX(10);
        circle3.setY(0);
        circle3.setRadius(2);
	    
        Circle circle4= new Circle();
        circle4.setX(10);
        circle4.setY(3);
        circle4.setRadius(4);
        
        boolean testA = (true == circle1.intersects(circle2));
        boolean testB = (true == circle2.intersects(circle1));
        boolean testC = (false == circle1.intersects(circle3));
        boolean testD = (true == circle3.intersects(circle4));
        
        System.out.println("\tTest Passed: " + testA + "\t (0,1,1) intersects (1,0,1): " + (boolean)intersectMethod.invoke(circle1, new Object []{ circle2 }));
        System.out.println("\tTest Passed: " + testB + "\t (1,0,1) intersects (0,1,1): " + (boolean)intersectMethod.invoke(circle2, new Object []{ circle1 }));
        System.out.println("\tTest Passed: " + testC + "\t (0,1,1) intersects (10,0,2): " + (boolean)intersectMethod.invoke(circle1, new Object []{ circle3 }));
        System.out.println("\tTest Passed: " + testD + "\t (10,0,2) intersects (10,3,4): " + (boolean)intersectMethod.invoke(circle3, new Object []{ circle4 }));
 
        return testA && testB && testC && testD;
    	}catch (Exception e){return false;}
    }
 
    public static boolean equalsTest()
    {
    	System.out.println("Equals Test:");
    	Method equalsMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(!setXYRadAllExist())
    		return false;
    	try {
			equalsMethod = Circle.class.getMethod("equals", new Class [] { Circle.class } );
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (equalsMethod == null){
    		System.out.println("\tequals method doesn't exist");
    		return false;
    	}
    	
    	try{
        Circle circle1= new Circle();  
        circle1.setX(10);
        circle1.setY(10);
        circle1.setRadius(5);
        
        Circle circle2= new Circle();
        circle2.setX(0);
        circle2.setY(10);
        circle2.setRadius(5);
        
        Circle circle3= new Circle();
        circle3.setX(0);
        circle3.setY(11);
        circle3.setRadius(5);
        
        Circle circle4= new Circle();
        circle4.setX(10);
        circle4.setY(10);
        circle4.setRadius(6);
                 
        boolean testA = (true == circle1.equals(circle1));
        boolean testB = (false == circle2.equals(circle1));
        boolean testC = (false == circle3.equals(circle2));
        boolean testD = (false == circle4.equals(circle1));
        
        System.out.println("\tTest Passed: " + testA + "\t (10,10,5) equals (10,10,5): " + (boolean)equalsMethod.invoke(circle1, new Object []{ circle1 }));
        System.out.println("\tTest Passed: " + testB + "\t (0,10,5)  equals (10,10,5): " + (boolean)equalsMethod.invoke(circle2, new Object []{ circle1 }));
        System.out.println("\tTest Passed: " + testC + "\t (0,11,5)  equals (0,10,5): " +  (boolean)equalsMethod.invoke(circle3, new Object []{ circle2 }));
        System.out.println("\tTest Passed: " + testD + "\t (10,10,6) equals (10,10,5): " + (boolean)equalsMethod.invoke(circle4, new Object []{ circle1 }));
 
        return testA && testB && testC && testD;
    	}catch (Exception e){return false;}
    }

    public static boolean isSmallerTest()
    {
    	System.out.println("Is Smaller Test:");
    	Method isSmallerMethod = null;
    	
    	//check to see if all of these methods exist in the Circle class
    	if(!setXYRadAllExist())
    		return false;
    	try {
			isSmallerMethod = Circle.class.getMethod("isSmaller", new Class [] { Circle.class } );
		} catch (NoSuchMethodException e) {}
    	
    	//if one of them doesn't exist, this test method will fail
    	if (isSmallerMethod == null){
    		System.out.println("\tisSmaller method doesn't exist");
    		return false;
    	}
    	
    	try{
        Circle circle1= new Circle();  
        circle1.setX(10);
        circle1.setY(10);
        circle1.setRadius(5);
        
        Circle circle2= new Circle();
        circle2.setX(0);
        circle2.setY(10);
        circle2.setRadius(5);
        
        Circle circle3= new Circle();
        circle3.setX(0);
        circle3.setY(11);
        circle3.setRadius(5);
        
        Circle circle4= new Circle();
        circle4.setX(10);
        circle4.setY(10);
        circle4.setRadius(6);
                 
        boolean testA = (false == circle1.isSmaller(circle2));
        boolean testB = (false == circle2.isSmaller(circle1));
        boolean testC = (false == circle3.isSmaller(circle2));
        boolean testD = (true == circle1.isSmaller(circle4));

        System.out.println("\tTest Passed: " + testA + "\t (10,10,5) is smaller (0,10,5): " + (boolean)isSmallerMethod.invoke(circle1, new Object []{ circle1 }));
        System.out.println("\tTest Passed: " + testB + "\t (0,10,5)  is smaller (10,10,5): " + (boolean)isSmallerMethod.invoke(circle2, new Object []{ circle1 }));
        System.out.println("\tTest Passed: " + testC + "\t (0,11,5)  is smaller (0,10,5): " +  (boolean)isSmallerMethod.invoke(circle3, new Object []{ circle2 }));
        System.out.println("\tTest Passed: " + testD + "\t (10,10,5) is smaller (10,10,6): " + (boolean)isSmallerMethod.invoke(circle4, new Object []{ circle1 }));
 
        return testA && testB && testC && testD;
    	}catch (Exception e){return false;}
    }
     
    public static void main(String[] args) {
         boolean flag3, flag4, flag5, flag6, flag7, flag8, flag9, flag10, flag11, flag12, flag13;
         flag3=flag4=flag5=flag6=flag7=flag8=flag9=flag10=flag11=flag12=flag13= false;
         
        //there's try-catch in all the tests so these should be unnecessary but there here anyways
    	try{ flag3 = unitCircleTest(); } catch (Exception e){}
    	try{ flag4 = xTest(); } catch (Exception e){}
    	try{ flag5 = yTest(); }catch (Exception e){}
    	try{ flag6 = radiusTest(); }catch (Exception e){}
    	try{ flag7 = distanceTest(); }catch (Exception e){}
    	try{ flag8 = areaTest(); }catch (Exception e){}
    	try{ flag9 = perimeterTest(); }catch (Exception e){}
    	try{ flag10 = diameterTest(); }catch (Exception e){}
    	try{ flag11 = intersectsTest(); }catch (Exception e){}
    	try{ flag12 = equalsTest(); }catch (Exception e){}
    	try{ flag13 = isSmallerTest(); }catch (Exception e){}
    	
        boolean flag = flag3 && flag4 && flag5 && flag6 && flag7 
        	&& flag8 && flag9 && flag10 && flag11 && flag12 && flag13;
        
        System.out.println("\n----------------");
        if (!flag3) System.out.println("-5 unit circle test");
        if (!flag4) System.out.println("-5 getting/setting x test");
        if (!flag5) System.out.println("-5 getting/setting y test");
        if (!flag6) System.out.println("-5 radius test");
        if (!flag7) System.out.println("-5 distance test");
        if (!flag8) System.out.println("-5 area test");
        if (!flag9) System.out.println("-5 perimeter test");
        if (!flag10) System.out.println("-5 diameter test");
        if (!flag11) System.out.println("-5 intersection test");
        if (!flag12) System.out.println("-5 equals test");
        if (!flag13) System.out.println("-5 is smaller test");
         
        System.out.print("\nAll TESTS PASSED: " + flag); 

        int f3 = flag3 ? 0 : 1;
        int f4 = flag4 ? 0 : 1;
        int f5 = flag5 ? 0 : 1;
        int f6 = flag6 ? 0 : 1;
        int f7 = flag7 ? 0 : 1;
        int f8 = flag8 ? 0 : 1;
        int f9 = flag9 ? 0 : 1;
        int f10 = flag10 ? 0 : 1;
        int f11 = flag11 ? 0 : 1;
        int f12 = flag12 ? 0 : 1;
        int f13 = flag13 ? 0 : 1;

        int sum = f3 + f4 + f5 + f6 + f7 + f8 + f9 + f10 + f11 + f12 + f13;

        System.exit(sum * 5);
    }
     
    private static boolean setXYRadAllExist()
    {
    	Method setXMethod = null, setYMethod=null, setRadiusMethod=null;
    	try {
			setXMethod = Circle.class.getMethod("setX", new Class [] { double.class });
		} catch (NoSuchMethodException e) {}
    	
    	try {
			setYMethod = Circle.class.getMethod("setY", new Class [] { double.class });
		} catch (NoSuchMethodException e) {}
    	
    	try {
			setRadiusMethod = Circle.class.getMethod("setRadius", new Class [] { double.class });
		} catch (NoSuchMethodException e) {}
    	//if one of them doesn't exist, this test method will fail
    	if (setXMethod == null){
    		System.out.println("\tsetX method doesn't exist");
    		return false;
    	}
    	if (setYMethod == null){
    		System.out.println("\tsetY method doesn't exist");
    		return false;
    	}
    	if (setRadiusMethod == null){
    		System.out.println("\tsetRadius method doesn't exist");
    		return false;
    	}
    	return true;
    }
}
