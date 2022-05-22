package Classes;

import Interfaces.PersonnelDocument;

public class EmploymentOrder extends PersonnelDocument {
    static private int count = 1;

    public EmploymentOrder(String name, String employee, String orderText) {
        super(count++, name, employee, orderText);
    }
}
