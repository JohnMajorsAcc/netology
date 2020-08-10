package com.company.task211;

import java.util.Arrays;

public enum Unit {
    GRAMM( "грамм"),
    LITER("литр"),
    PIECE("штука"),
    CAN("банка");


    private String translation;

    Unit( String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public static Unit getUnitByOrdinal(int ordinal){
        return  Arrays.stream(Unit.values())
                .filter(e -> e.ordinal() == ordinal)
                .findFirst()
                .get();
    }


}
