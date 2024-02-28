public class Test {
    public static void main(String args[]){
        ImageRVB rgb=new ImageRVB(2, 2);
        ImageNB nb=new ImageNB(2, 2);

        rgb.setPoints(0, 0, new RgbColor(210, 100, 400));
        rgb.setPoints(0, 1, new RgbColor(210, 100, 400));
        rgb.setPoints(1, 0, new RgbColor(210, 100, 400));
        rgb.setPoints(1, 1, new RgbColor(210, 100, 400));

        nb.setPoints(0, 0, 0);
        nb.setPoints(0, 1, 1);
        nb.setPoints(1, 0, 0);
        nb.setPoints(1, 1, 1);

        System.out.println("est ce que rgb est en couleur : " + rgb.estEnCouleur());
        System.out.println("est ce que nb est en couleur : " + nb.estEnCouleur());

        ImageRVB rgb2=new ImageRVB(2, 2);


        rgb.setPoints(0, 0, new RgbColor(210, 100, 400));
        rgb.setPoints(0, 1, new RgbColor(210, 100, 400));
        rgb.setPoints(1, 0, new RgbColor(210, 100, 400));
        rgb.setPoints(1, 1, new RgbColor(210, 100, 400));

        System.out.println("est ce que rgb == rgb2 : " + rgb.equals(rgb2));

        ImageRVB rgb3=new ImageRVB(2, 2);
        
        rgb3.setPoints(0, 0, new RgbColor(240, 110, 200));
        rgb3.setPoints(0, 1, new RgbColor(210, 110, 100));
        rgb3.setPoints(1, 0, new RgbColor(240, 120, 200));
        rgb3.setPoints(1, 1, new RgbColor(240, 130, 300));

        System.out.println("est ce que rgb == rgb2 si diff: " + rgb.equals(rgb3));
    }
}
