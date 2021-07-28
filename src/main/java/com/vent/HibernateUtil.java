package com.vent;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static StandardServiceRegistry registry;
    private static StandardServiceRegistry registryStock;
    private static SessionFactory sessionFactory;
    private static SessionFactory sessionFactoryStock;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Create registry
                registry = new StandardServiceRegistryBuilder().configure().build();

                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);

                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();

                // Create SessionFactory
                sessionFactory = metadata.getSessionFactoryBuilder().build();

            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory(String resourcesName) {
        if (sessionFactoryStock == null) {
            try {
                // Create registry
                registryStock = new StandardServiceRegistryBuilder().configure(resourcesName).build();

                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registryStock);

                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();

                // Create SessionFactory
                sessionFactoryStock = metadata.getSessionFactoryBuilder().build();

            } catch (Exception e) {
                e.printStackTrace();
                if (registryStock != null) {
                    StandardServiceRegistryBuilder.destroy(registryStock);
                }
            }
        }
        return sessionFactoryStock;
    }
}