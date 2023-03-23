package demos.Image_Loader_task.app.base;

import demos.Image_Loader_task.app.adapter.ImageAdapter;
import demos.Image_Loader_task.app.interfaces.ImageReader;

public class PicViewer implements ImageReader {

    ImageAdapter imageAdapter;

    @Override
    public void read(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("bmp")) {
            System.out.println("Reading bmp file: " + fileName);
        }

        else if (imageType.equalsIgnoreCase("jpg") ||
                imageType.equalsIgnoreCase("png")
        ) {
            imageAdapter = new ImageAdapter(imageType);
            imageAdapter.read(imageType, fileName);
        } else {
            System.out.println("Invalid image " + imageType + " format not supported");
        }
    }
}
