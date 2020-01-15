package de.wdr.docker.prototype.repo;


import org.springframework.data.solr.repository.SolrCrudRepository;

import de.wdr.docker.prototype.model.UserEntry;

public interface UserRepository extends  SolrCrudRepository<UserEntry, Long> {
	
}
