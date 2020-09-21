package com.company.task322.Tax;

import java.math.BigDecimal;

public class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    protected TaxService taxService;


    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}