public class Movemerida implements Meridamovement  {
    int x1,y1;
    Brave b1;
    public Movemerida(int x,int y, Brave b){
     x1=x;
     y1=y;
     b1=b;
    }

    @Override
    public void moveUp() {      
        
    
        
        //System.out.println(x1);
        b1.setLocation(x1, y1-6);
        
        
    }

    @Override
    public void moveDown() {
        
        //Brave b=new Brave();
        //System.out.println("Move merida down");
        b1.setLocation(x1, y1+2);
    }
    
    @Override
    public void moveFront() {
        
        //Brave b=new Brave();
        //System.out.println("Move merida down");
        b1.setLocation(x1+4, y1);
    }
    
    @Override
    public void moveBack() {
        
        //Brave b=new Brave();
        //System.out.println("Move merida down");
        b1.setLocation(x1-4, y1);
    }
    

}