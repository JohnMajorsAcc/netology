package com.company.task322.Tax;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal taxPercent = new BigDecimal(0.15);
        return amount.multiply(taxPercent);
    }
}
