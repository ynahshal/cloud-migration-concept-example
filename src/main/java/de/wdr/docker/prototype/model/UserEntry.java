package de.wdr.docker.prototype.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.Getter;
import lombok.NoArgsConstructor;

@SolrDocument(collection = "User")
@NoArgsConstructor
@Getter
public class UserEntry {

	@Id
	@Indexed(name = "uid", type = "long")
	private Long userId;
	
	@Indexed(name = "uname", type = "string")
	private String userName;
	
	@Indexed(name = "uage", type = "int")
	private int userAge;
}
