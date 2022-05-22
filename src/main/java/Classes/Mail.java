package Classes;

import Interfaces.Document;
import lombok.Getter;
import lombok.Setter;

public class Mail extends Document {
    static private int count = 1;

    private final String name;
    @Getter
    @Setter
    private String from;
    @Getter
    @Setter
    private String to;
    @Getter
    @Setter
    private String message;

    public Mail(String name, String from, String to, String message) {
        super(count++, name);
        this.name = name;
        this.from = from;
        this.to = to;
        this.message = message;
    }

    @Override
    public String getPrintedText() {
        return super.getPrintedText() +
                String.format("Отправитель: %1$s\n", from) +
                String.format("Адресат: %1$s\n", to) +
                String.format("Сообщение: %1$s\n", message);
    }
}
