public class Main {
    public static void main(String[] args) {

        Lens lens1 = new Lens(100,300);
//        Lens lens2 = new Lens(300,100);
        Lens ultra = new Lens(100,55000);

//        lens1.setMinFocalLength(400);



        Camera camera1 = new Camera("Nikon", 2, 4, true, lens1);
        Camera camera2 = new Camera("Nokia", 8, 5, false, lens1);
        Camera camera3 = new Camera("Akion", 7, 3, true, ultra);

//        camera1.setColored(false);

        System.out.println("camera1 -> " + camera1);
        System.out.println("camera2 -> " + camera2);
        System.out.println("camera3 -> " + camera3);



        System.out.println("Camera Counter " + Camera.getCameraCounter());
        System.out.println("Camera Counter " + Lens.getLensCounter());
    }
}
