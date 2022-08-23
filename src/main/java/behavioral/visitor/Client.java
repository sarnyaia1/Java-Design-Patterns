package behavioral.visitor;

public class Client {

  public static void main(String[] args) {
    StaffList staffList = new StaffList();
    System.out.println("Total amount paid to staff: " + staffList.getSalary());
    staffList.accept(new SalaryAdjustmentVisitor());
    System.out.println("The new total amount paid to staff: " + staffList.getSalary());
  }

}
