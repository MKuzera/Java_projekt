package library.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka";
        System.out.println(appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();

    }
}
