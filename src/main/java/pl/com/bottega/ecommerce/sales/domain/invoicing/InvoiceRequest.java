package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;

public class InvoiceRequest {

    private final ClientData client;
    private final List<RequestItem> items = new ArrayList<>();

    public InvoiceRequest(ClientData client) {
        this.client = client;
    }

    public void add(RequestItem item) {
        items.add(item);
    }

    public ClientData getClient() {
        return client;
    }

    public Collection<RequestItem> getItems() {
        return Collections.unmodifiableCollection(items);
    }
}
