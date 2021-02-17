import java.io.*;

class PointOne 
{
    private Integer x;
    private Integer y;
 
    PointOne(int x, int y){
    	this.x = x;
	this.y = y;
    }
    
    PointOne(PointOne point){
        this.x = point.x;
        this.y = point.y;
    }
}

class PointTwo extends PointOne
{
    private Integer z;

    PointTwo(int x, int y, int z){
        super(x, y);
        this.z = z;
    }


    PointTwo(PointTwo point){
        super(point); 
        this.z = point.z;
    }
}

class CopyConstructor
{
    public static void main(String[] args)
    {
        PointOne one = new PointOne(1,2);
        PointTwo two = new PointTwo(1,2,3);

        PointOne clone1 = new PointOne(one);
        PointOne clone2 = new PointOne(two);

        System.out.println(clone1.getClass());
        System.out.println(clone2.getClass());
    }
}
