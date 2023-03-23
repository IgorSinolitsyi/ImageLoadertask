package demos.Image_Loader_task.app;

import demos.Image_Loader_task.app.base.PicViewer;

public class SlideshowAppStarter {

    public static void main(String[] args) {

        PicViewer picViewer = new PicViewer();

        picViewer.read("jpg", "Storm Shadow.jpg");
        picViewer.read("png", "SCALP Naval.png");
        picViewer.read("bmp", "3М-54 Калибр.bmp");
        picViewer.read("gif", "YingJi-18.gif");
    }
}
