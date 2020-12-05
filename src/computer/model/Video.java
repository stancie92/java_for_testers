package computer.model;

public interface Video {

    void playVideo();
    void stopVideo();
    void pauseVideo();

    default void sayHello(){
        System.out.println("Hello Video");
    }
}
