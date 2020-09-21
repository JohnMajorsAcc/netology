package com.company.task322.Tax;

import java.math.BigDecimal;

public class VATaxType extends TaxType{
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal taxPercent = new BigDecimal(0.18);
        return amount.multiply(taxPercent);
    }
}
