package com.example.springDataRestpractice;

import com.example.springDataRestpractice.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer> {
}
//we dont need a controller to perform the crud operations on the
//repo. This is the importance of spring data REST.