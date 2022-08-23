package structural.bridge;

public class LargeButtonSize implements ButtonSize{

    @Override
    public void getSize() {
        System.out.println("Seeting size to large...");
    }
}
