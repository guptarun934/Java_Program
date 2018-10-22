package DesignPattern.BuilderPattern;

public abstract class CameraBuilder {
    protected Camera camera;

    public Camera getCamera(){
        return this.camera;
    }
    public void createNewCamera(){
        this.camera = new Camera();
    }
    public abstract void builOpticalZome();
    public abstract void buildDigitalZome();
    public abstract void buildDisplay();
    public abstract void buildMemory();
}
