package com.jancy.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jancy.demo.model.Alien;


@RepositoryRestResource(collectionResourceRel = "aliens", path="aliens")
public interface AlienDao extends JpaRepository<Alien, Integer>{

}
