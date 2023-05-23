package com.example.demoHibernate.Repositories;

import com.example.demoHibernate.Models.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class PublisherRepository implements CrudRepository<Publisher, UUID>{
    @Override
    public <S extends Publisher> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Publisher> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Publisher> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public Iterable<Publisher> findAll() {
        return null;
    }

    @Override
    public Iterable<Publisher> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(Publisher entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends Publisher> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
