package com.jobsity.rest.service;

import com.jobsity.rest.domain.Invoice;
import com.jobsity.rest.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository repository;

    public InvoiceServiceImpl(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> findAll() {
        return repository.findAll();
    }

    @Override
    public Invoice findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Invoice create(Invoice invoice) {
        return repository.create(invoice);
    }

    @Override
    public Invoice update(Long id, Invoice invoice) {
        return repository.update(id, invoice);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

}
