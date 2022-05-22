package Classes;

import Interfaces.PersonnelDocument;
import lombok.Getter;
import lombok.Setter;

public class DismissalOrder extends PersonnelDocument {
    static private int count = 1;

    @Getter
    @Setter
    private String reasonDismissal;

    public DismissalOrder(String name, String employee, String orderText, String reasonDismissal) {
        super(count++, name, employee, orderText);
        this.reasonDismissal = reasonDismissal;
    }

    @Override
    public String getPrintedText() {
        return super.getPrintedText() + String.format("Причина уволнения: %1$s\n", reasonDismissal);
    }
}
