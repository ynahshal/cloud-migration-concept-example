package de.wdr.docker.prototype.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootConfiguration
@EnableSolrRepositories(basePackages = "de.wdr.docker.prototype.repo")
public class DefaultConfiguration {

	@Value("${spring.data.solr.host}")
	private String baseSolrUrl;
	
	@Bean
	public SolrClient solrClient() {
		return new HttpSolrClient.Builder(baseSolrUrl).build();
	}
	
	@Bean
	public SolrTemplate solrTemplate(SolrClient client) {
		return new SolrTemplate(client);
	}
}
