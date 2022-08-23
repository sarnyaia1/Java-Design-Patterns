package structural.bridge;

public class SmallButtonSize implements ButtonSize{
    @Override
    public void getSize() {
        System.out.println("Set button size to small...");
    }
}
