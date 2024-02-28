public abstract class Image{
    private int width;
    private int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        
    }

    public int getwidth() {
        return width;
    }
    public void setwidth(int width) {
        this.width = width;
    }
    public int getheight() {
        return height;
    }
    public void setheight(int height) {
        this.height = height;
    }


    public abstract boolean estEnCouleur();
}