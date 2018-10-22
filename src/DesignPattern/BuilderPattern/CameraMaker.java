package DesignPattern.BuilderPattern;

public class CameraMaker {
    private CameraBuilder cameraBuilder = null;

    public void setCameraBuilder(CameraBuilder cameraBuilder){
        this.cameraBuilder=cameraBuilder;
    }
    public Camera getCamera(){
        return this.cameraBuilder.getCamera();
    }
    public void constructCamera(){
        this.cameraBuilder.createNewCamera();
        this.cameraBuilder.buildDigitalZome();
        this.cameraBuilder.builOpticalZome();
        this.cameraBuilder.buildDisplay();
        this.cameraBuilder.buildMemory();
    }
}
