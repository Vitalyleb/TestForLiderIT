package com.example.rest.controller;

import com.example.rest.model.Showcase;
import com.example.rest.service.ShowcaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowcaseController {

    private final ShowcaseService showcaseService;


    @Autowired
    public ShowcaseController(ShowcaseService showcaseService){
        this.showcaseService = showcaseService;
    }

    @PostMapping(value = "/shocase")
    public ResponseEntity<?> create(@RequestBody Showcase showcase){
        showcaseService.create(showcase);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/showcase")
    public ResponseEntity<List<Showcase>> read() {
        final List<Showcase> showcase = showcaseService.readAll();

        return showcase != null &&  !showcase.isEmpty()
                ? new ResponseEntity<>(showcase, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/showcase/{dt}")
    public ResponseEntity<Showcase> readDt(@PathVariable(name = "dt") String dt) {
        final Showcase client = showcaseService.readDt(dt);

        return client != null
                ? new ResponseEntity<>(client, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/showcase/{updating}")
    public ResponseEntity<Showcase> readUp(@PathVariable(name = "updating") String updating) {
        final Showcase showcase = showcaseService.readUp(updating);

        return showcase != null
                ? new ResponseEntity<>(showcase, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/showcase/{address}")
    public ResponseEntity<Showcase> readAdd(@PathVariable(name = "address") char address) {
        final Showcase showcase = showcaseService.read(address);

        return showcase != null
                ? new ResponseEntity<>(showcase, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/showcase/{id}")
    public ResponseEntity<Showcase> read(@PathVariable(name = "id") int id) {
        final Showcase showcase = showcaseService.read(id);

        return showcase != null
                ? new ResponseEntity<>(showcase, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/showcase/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Showcase showcase) {
        final boolean updated = showcaseService.update(showcase, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/showcase/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = showcaseService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}
