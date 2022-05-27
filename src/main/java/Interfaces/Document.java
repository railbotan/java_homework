package Interfaces;

import lombok.Getter;
import lombok.Setter;

public abstract class Document implements Printed {
    @Getter
    private final int number;
    @Getter
    @Setter
    private String name;

    public Document(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String getPrintedText() {
        return this.getNumberWithName();
    }

    @Override
    public String getNumberWithName() {
        return String.format("Номер документа: %1$s\n", number) +
                String.format("Наименование документа: %1$s\n", name);
    }
}
