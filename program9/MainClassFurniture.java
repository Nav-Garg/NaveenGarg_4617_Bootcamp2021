public interface Furniture {
	public boolean stressTest();
	public boolean fireTest();
}
public class FurnitureItem implements Furniture {
	double weight; 
	int dimensions;
	public boolean fireTest(){
		//general tests for the furniture
	}
	public boolean stressTest(){
		//general tests for the furniture
	}
}

public class Chair extends FurnitureItem {
	boolean headrest;
	boolean armrest;
	public String toString()
	{
		//say print chair 
	}
	public boolean fireTest(){
	//general tests for the chair
	}
	public boolean stressTest(){
	//general tests for the chair
	}
}

public class Table extends FurnitureItem {
	int legs;
	boolean foldable;
	public String toString()
	{
		//say print Table 
	}
	public boolean fireTest(){
		//general tests for the Table
	}
	public boolean stressTest(){
		//general tests for the Table
	}
}

public class MetalChair extends Chair {
	boolean painted = true;
	String metaltype="";


	public boolean stressTest() {
		//specific to metal chairs
	}

	public boolean fireTest() {
		
		//specific to metal chairs
		return  //if everthing is true;
	}
	public String toString()
	{
		//say print
	}

}

public class MetalTable extends Table {
	boolean painted = true;
	String metaltype="";
	public boolean stressTest() {
		//specific to metal table
	}

	public boolean fireTest() {
		//specific to metal table
		return //if everthing is true;
	}
	public String toString()
	{
		//say print 
	}
}


public class WoodenTable extends Table {
	boolean polished = true;
	String woodType="";
	public boolean stressTest() {
		//specific to metal table
	}

	public boolean fireTest() {
		//specific to metal table
		return //if everthing is true;
	}
	public String toString()
	{
		//say print 
	}
}
public class WoodenChair extends Chair {
	boolean polished = true;
	String woodType="";
	public boolean stressTest() {
		//specific to metal table
	}
	public boolean fireTest() {
		//specific to metal table
		return  //if everthing is true;
	}
	public String toString()
	{
		//say print 
	}
}
public class MainClassFurniture {
	public static void main(String[] args){
	 	//Main class
	}
}
