package com.springframework.sfpetclinic.services.map;

import com.springframework.sfpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (object == null) {
            throw new RuntimeException("Object is cannot be null!");
        }

        if (object.getId() == null) {
            object.setId(genNextID());
        }

        map.put(object.getId(), object);

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long genNextID() {

        Long nextGeneratedID = null;

        try {
            nextGeneratedID = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException ex) {
            nextGeneratedID = 1L;
        }

        return nextGeneratedID;

    }
}

