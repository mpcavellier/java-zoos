package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.models.ZooAnimalId;
import com.lambdaschool.zoos.models.Zooanimals;
import org.springframework.data.repository.CrudRepository;

public interface ZooanimalsRepository extends CrudRepository<Zooanimals, ZooAnimalId> {
}
