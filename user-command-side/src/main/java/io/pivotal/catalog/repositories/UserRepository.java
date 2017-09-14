package io.pivotal.catalog.repositories;

import io.pivotal.catalog.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Uses 'Spring Data JPA' and 'Spring Data Rest' to create a Repository.
 * The Repository can be used in the EventProcessor to create, read, update and delete the Products in the database.
 * This interface definition hides the Save and Delete operations from the automatically produced REST endpoint.
 * Rest endpoint uses the pluralised name of the Entity by default (/products).
 */

@RepositoryRestResource(path = "users")
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    @RestResource(exported = false)
    User findOne(Long id);

    @Override
    @RestResource(exported = false)
    Iterable<User> findAll();

    @Override
    @RestResource(exported = false)
    Iterable<User> findAll(Iterable<Long> ids);


}
