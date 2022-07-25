package it.accenture.footballclub.model;

public interface WithId<K> {
    K getId();
    void setId(K id);
}
