package it.accenture.footballclub.exception;

public class EntityNotFoundException extends Exception {

    public EntityNotFoundException(String message, Class<?> entity, long id) {
        super(String.format(message, entity.getSimpleName(), id));
    }

}
