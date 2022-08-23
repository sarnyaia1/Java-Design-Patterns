package behavioral.visitor;

public interface Visitor {

    void visit(Manager manager);
    void visit(SalesPerson salesPerson);
    void visit(StaffList staffList);

}
