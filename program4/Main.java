class single{
    private static single single_instance=null;
    public String str;
    private single(){
        str="String of single";
    }
    public static single getSingle_instance(){
        if(single_instance==null){
            single_instance=new single();
        }
        return single_instance;
    }
}

class Main 
{ 
     public static void main(String[] args) {
        single ob=single.getSingle_instance();
        System.out.println(ob.str);
        ob.str="modified string";
        single ob1=single.getSingle_instance();
        System.out.println(ob1.str);
    }

} 
