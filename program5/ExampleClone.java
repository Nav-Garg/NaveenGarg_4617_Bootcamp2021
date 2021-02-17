class ExampleClone implements Cloneable{
int rollno;
String name;

ExampleClone(int rollno,String name){
this.rollno=rollno;
this.name=name;
}

public Object clone()throws CloneNotSupportedException{
return super.clone();
}

public static void main(String args[]){
try{
ExampleClone s1=new ExampleClone(101,"Naveen");

ExampleClone s2=(ExampleClone)s1.clone();

System.out.println(s1.rollno+" "+s1.name);
System.out.println(s2.rollno+" "+s2.name);

}catch(CloneNotSupportedException c){}

}
}
