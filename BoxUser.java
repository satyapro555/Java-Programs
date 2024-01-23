class BoxUser
{
    public static void main(String []imed) {
        Box b1 = new Box();
        if( b1 instanceof Box)
          System.out.println("b1 is instance of Box");

        if( b1 instanceof Object)
           System.out.println("b1 is instance of Object");
        else  
            System.out.println("b1 is not instance of Object");
        //int e = b1.getElement();
        //System.out.println("box contains: "+e);
        //b1.element = 1234;
        //.System.out.println("box contains: "+b1.element);
    }
}