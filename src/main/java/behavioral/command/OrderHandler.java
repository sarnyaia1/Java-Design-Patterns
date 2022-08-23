package behavioral.command;

public class OrderHandler {

  public void invoke(Command command) {
    command.execute();
  }

}
