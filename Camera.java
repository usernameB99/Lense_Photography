public class Camera {

    private String brand;

    private int megaPixels;

    private int displaySize;

    private boolean colored;
    private Lens lens;

    public static int getCameraCounter() {
        return cameraCounter;
    }

    private static int cameraCounter = 0;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }


    public Camera (String brand, int megaPixels, int displaySize, boolean colored, Lens lens) {

        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        cameraCounter++;

        // cameracounter += cameracounter
    }

    public boolean isColored(){
        return colored;
    }


    //@Override
    public String toString(){

        String colorType;

        if(colored){
            colorType = "gscheitfoabig";
        }
        else{
            colorType = "schwoarzweiss";
        }

        String result = "Brand: " + brand + " MP: " + megaPixels + " Inch: " + displaySize + " Color-Type: " + colorType + lens.toString();
        // /
        return  result;
    }

}
