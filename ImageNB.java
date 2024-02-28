public class ImageNB extends Image {
    private int [][] Points;


    public ImageNB(int width, int height) {
        super(width, height);
        this.Points=new int[width][height];
   
    }



    public int getPoints(int x, int y) {
        return Points[x][y];
    }

    public void setPoints(int x, int y,int color) {
        Points[x][y]=color;
    }

    @Override
    public boolean estEnCouleur() {
        return false;
    }
    
    
   
    
}
