package demos.Image_Loader_task.app.adapter;

import demos.Image_Loader_task.app.additional_types_readers.JpgReader;
import demos.Image_Loader_task.app.additional_types_readers.PngReader;
import demos.Image_Loader_task.app.interfaces.AdvancedImageReader;
import demos.Image_Loader_task.app.interfaces.ImageReader;

public class ImageAdapter implements ImageReader {

    AdvancedImageReader advancedImageReader;

    public ImageAdapter(String imageType) {

        if (imageType.equalsIgnoreCase("jpg")) {
            advancedImageReader = new JpgReader();
        } else if (imageType.equalsIgnoreCase("png")) {
            advancedImageReader = new PngReader();
        }
    }

    @Override
    public void read(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("jpg")) {
            advancedImageReader.readJpg(fileName);
        } else if (imageType.equalsIgnoreCase("png")) {
            advancedImageReader.readPng(fileName);
        }
    }
}
