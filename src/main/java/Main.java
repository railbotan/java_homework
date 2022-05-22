import Classes.DismissalOrder;
import Classes.EmploymentOrder;
import Classes.Mail;

public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail(
                "Письмо",
                "example.sender@mail.ru",
                "example.addressee@mail.ru",
                "Здравствуйте"
        );
        EmploymentOrder employmentOrder = new EmploymentOrder(
                "Приказ об принятии на работу",
                "Иванов Иван Иванович",
                "Принять сотрудника на должность меженджера."
        );
        DismissalOrder dismissalOrder = new DismissalOrder(
                "Приказ об увольнении",
                "Иванов Иван Иванович",
                "Уволить сотрудника c должности меженджера.",
                "По собственному желению."
        );

        if (args.length > 0 && args[0].equals("-simple")) {
            simpleRun(mail, employmentOrder, dismissalOrder);
        }
        else {
            fullRun(mail, employmentOrder, dismissalOrder);
        }
    }

    private static void simpleRun(Mail mail, EmploymentOrder employmentOrder, DismissalOrder dismissalOrder) {
        System.out.println(mail.getNumberWithName());
        System.out.println();
        System.out.println(employmentOrder.getNumberWithName());
        System.out.println();
        System.out.println(dismissalOrder.getNumberWithName());
        System.out.println();
    }

    private static void fullRun(Mail mail, EmploymentOrder employmentOrder, DismissalOrder dismissalOrder) {
        System.out.println(mail.getPrintedText());
        System.out.println();
        System.out.println(employmentOrder.getPrintedText());
        System.out.println();
        System.out.println(dismissalOrder.getPrintedText());
        System.out.println();
        System.out.println("Выполнить приказы");
        employmentOrder.execute();
        dismissalOrder.execute();
        System.out.println(employmentOrder.getPrintedText());
        System.out.println();
        System.out.println(dismissalOrder.getPrintedText());
        System.out.println();
    }
}
