package computer.model;

public interface Music {


    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHello(){
        System.out.println("Hello");
    }

    private static void privateMethod(){
        System.out.println("hellofd");
    }
}
