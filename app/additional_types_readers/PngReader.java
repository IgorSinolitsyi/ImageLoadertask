package demos.Image_Loader_task.app.additional_types_readers;

import demos.Image_Loader_task.app.interfaces.AdvancedImageReader;

public class PngReader implements AdvancedImageReader {

    @Override
    public void readPng(String fileName) {
        System.out.println("Reading png file: "+ fileName);
    }

    @Override
    public void readJpg(String fileName) {
        // нет реализации
    }
}
