package com.company.task322;

import com.company.task322.Tax.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(100000), new IncomeTaxType(), new TaxService()),
                new Bill(new BigDecimal(100000), new VATaxType(), new TaxService()),
                new Bill(new BigDecimal(100000), new ProgressiveTaxType(), new TaxService())

        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
