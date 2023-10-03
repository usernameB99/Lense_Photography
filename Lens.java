public class Lens {

    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        if (maxFocalLength < minFocalLength){
            throw new IllegalArgumentException("herst wie soi des geh herst wenn max klana is wie min??");
        }
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        if (maxFocalLength < minFocalLength){
            throw new IllegalArgumentException("herst wie soi des geh herst wenn max klana is wie min??");
        }
        this.maxFocalLength = maxFocalLength;
    }

    private int minFocalLength;

    private int maxFocalLength;

    public static int getLensCounter() {
        return lensCounter;
    }

    private static int lensCounter = 0;

    public Lens(int min, int max){
        this.minFocalLength = min;
        this.setMaxFocalLength(max);
        lensCounter++;

    }

    public String toString(){
        String result = " Min: " + minFocalLength + " Max: " + maxFocalLength;
        return  result;
    }


}
