package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxCalculator {
    public InvoiceLine generateInvoiceLine(RequestItem item);
}
