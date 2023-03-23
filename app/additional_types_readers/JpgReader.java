package demos.Image_Loader_task.app.additional_types_readers;

import demos.Image_Loader_task.app.interfaces.AdvancedImageReader;

public class JpgReader implements AdvancedImageReader {

    @Override
    public void readPng(String fileName) {
        // нет реализации
    }

    @Override
    public void readJpg(String fileName) {
        System.out.println("Reading jpg file: " + fileName);
    }
}
