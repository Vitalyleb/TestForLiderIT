package com.example.rest.service;

import com.example.rest.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductServiceImpl implements ProductService{

    private static final Map<Integer, Product> PRODUCT_MAP = new HashMap<>();
    private static final AtomicInteger PRODUCT_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Product product) {
        final int showcaseId =  PRODUCT_ID_HOLDER.incrementAndGet();
        product.setId(showcaseId);
        PRODUCT_MAP.put(showcaseId, product);
    }

    @Override
    public List<Product> readAll() {
        return new ArrayList<>(PRODUCT_MAP.values());
    }

    @Override
    public Product read(int id) {
        return PRODUCT_MAP.get(id);
    }

    @Override
    public boolean update(Product product, int id) {
        if (PRODUCT_MAP.containsKey(id)) {
            product.setId(id);
            PRODUCT_MAP.put(id, product);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
            return PRODUCT_MAP.remove(id) != null;
    }
}
