package Creational.Multiton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Camera {
    private static Map<CameraPosition, Camera> cameraMap = new ConcurrentHashMap<>();

    private CameraPosition type;

    private Camera(CameraPosition type) {
        this.type = type;
    }

    public static Camera getInstance(CameraPosition type) {
        Camera camera = cameraMap.get(type);
        if (camera==null){
            cameraMap.put(type, new Camera(type));
        }
        return camera;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "type=" + type +
                '}';
    }
}
