package DesignPattern.BuilderPattern;

public class DigitalZoomCameraBuilder extends CameraBuilder {
    @Override
    public void builOpticalZome () {
        this.camera.setOpticalZoom("None");
    }

    @Override
    public void buildDigitalZome () {
        this.camera.setDigitalZoom("10X Optical Zoom");

    }

    @Override
    public void buildDisplay () {
        this.camera.setDisplaySize("5 inch LED Screen");

    }

    @Override
    public void buildMemory () {
        this.camera.setInMemorySize("16GB inbuilt memory");

    }
}
