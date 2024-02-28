public class ImageRVB extends Image {
    private RgbColor[][] Points;

    public ImageRVB(int width, int height) {
        super(width, height);
        this.Points = new RgbColor[width][height];
    }

    public RgbColor getPoints(int x,int y) {
        return Points[x][y];
    }

    public RgbColor[][] getall() {
        return Points;
    }

    public void setPoints(int x,int y, RgbColor color) {
        Points[x][y] = color;
    }

    @Override
    public boolean estEnCouleur() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ImageRVB){
            ImageRVB tmp =(ImageRVB) obj;
            
            if (this.getall()==tmp.getall()){
                return true;
            }
        }
        return false;
    }

    
}

