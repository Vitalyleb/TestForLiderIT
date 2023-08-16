package com.example.rest.service;

import com.example.rest.model.Showcase;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ShowcaseServiceImpl implements ShowcaseService{

    private static final Map<Integer, Showcase> SHOWCASE_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger SHOWCASE_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Showcase showcase){
        final int showcaseId =  SHOWCASE_ID_HOLDER.incrementAndGet();
        showcase.setId(showcaseId);
        SHOWCASE_REPOSITORY_MAP.put(showcaseId, showcase);

    }

    @Override
    public List<Showcase> readAll() {
        return new ArrayList<>(SHOWCASE_REPOSITORY_MAP.values());
    }

    @Override
    public Showcase read(int id) {
        return SHOWCASE_REPOSITORY_MAP.get(id);    }

    @Override
    public Showcase readAdd(char address) {
        return SHOWCASE_REPOSITORY_MAP.get(address);
    }

    @Override
    public Showcase readDt(String dt) {
        return SHOWCASE_REPOSITORY_MAP.get(dt);
    }

    @Override
    public Showcase readUp(String updating) {
        return SHOWCASE_REPOSITORY_MAP.get(updating);
    }

    @Override
    public boolean update(Showcase showcase, int id) {
        if (SHOWCASE_REPOSITORY_MAP.containsKey(id)) {
            showcase.setId(id);
            SHOWCASE_REPOSITORY_MAP.put(id, showcase);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        return SHOWCASE_REPOSITORY_MAP.remove(id) != null;
    }

}
