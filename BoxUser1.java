class BoxUser1
{
    public static void main(String []imed) {
        Box<Integer> b1 = new Box<Integer>();
        b1.setElement(11.6);
        //float f = 11.9; 
        
        
        int e = b1.getElement();
        System.out.println("box contains: "+e);
        //b1.element = 1234;
        //.System.out.println("box contains: "+b1.element);
    }
}