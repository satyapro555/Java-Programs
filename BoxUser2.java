class BoxUser2
{
    public static void main(String []imed) {
        Box<String> b1 = new Box<String>();
        b1.setElement("IMED");
        //float f = 11.9; 
        
       
        String e = b1.getElement();
        System.out.println("box contains: "+e);
       
       Integer i1 = 22;
       Float i2 = i1.floatValue();
    }
}