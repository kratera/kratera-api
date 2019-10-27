package io.kratera.userservice.app.config;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.kratera.userservice.domain.entity.KrateraUser;

@Configuration
@ComponentScan("io.kratera")
public class KrateraUserConfig {

	/*
	@Bean
	public SessionFactory getSessionFactory() {
		try {
			StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

			Map<String, String> settings = new HashMap<String, String>();

			settings.put(Environment.DRIVER, "org.h2.Driver");
			settings.put(Environment.URL, "jdbc:h2:mem:testdb");
			settings.put(Environment.USER, "sa");
			settings.put(Environment.PASS, "sa");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
			settings.put(Environment.SHOW_SQL, "false");
			settings.put(Environment.HBM2DDL_AUTO, "create");
			settings.put(Environment.POOL_SIZE, "10");
			settings.put(Environment.NON_CONTEXTUAL_LOB_CREATION, "true");
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

			registryBuilder.applySettings(settings);

			StandardServiceRegistry registry = registryBuilder.build();

			MetadataSources sources = new MetadataSources(registry).addAnnotatedClass(KrateraUser.class);

			Metadata metadata = sources.getMetadataBuilder().build();

			return metadata.getSessionFactoryBuilder().build();
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	*/
}
