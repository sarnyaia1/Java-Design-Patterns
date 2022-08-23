package structural.bridge;

public class MediumButtonSize implements ButtonSize{

    @Override
    public void getSize() {
        System.out.println("Set button size to medium...");
    }
}
