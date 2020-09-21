package com.company.task322.Tax;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal taxPercent = new BigDecimal(0.13);
        return amount.multiply(taxPercent);
    }

}
