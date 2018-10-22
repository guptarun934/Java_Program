package DesignPattern.BuilderPattern;

public class OpticalZoomCameraBuilder extends CameraBuilder{
    @Override
    public void builOpticalZome () {
        this.camera.setOpticalZoom("50x optical zoom");
    }

    @Override
    public void buildDigitalZome () {
        this.camera.setDigitalZoom("None");

    }

    @Override
    public void buildDisplay () {
        this.camera.setDisplaySize("6 inch LED screen with touch functionality ");

    }

    @Override
    public void buildMemory () {
        this.camera.setInMemorySize("32GB inbuilt memory");

    }
}
