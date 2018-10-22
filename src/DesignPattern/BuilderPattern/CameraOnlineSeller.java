package DesignPattern.BuilderPattern;

public class CameraOnlineSeller {
    public static void main (String[] args) {
        CameraMaker cameraMaker = new CameraMaker();
        System.out.println("Creating camera with optical zoom...");
        CameraBuilder cameraBuilder = new OpticalZoomCameraBuilder();
        cameraMaker.setCameraBuilder(cameraBuilder);
        cameraMaker.constructCamera();
        Camera camera = cameraMaker.getCamera();
    }
}
