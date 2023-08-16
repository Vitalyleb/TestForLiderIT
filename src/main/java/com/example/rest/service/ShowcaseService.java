package com.example.rest.service;


import com.example.rest.model.Showcase;

import java.util.List;

public interface ShowcaseService {

    void create(Showcase showcase);

    List<Showcase> readAll();

    Showcase read(int id);
    Showcase readAdd(char address);
    Showcase readDt(String dt);
    Showcase readUp(String updating);



    boolean update(Showcase showcase, int id);
    boolean delete(int id);
}
