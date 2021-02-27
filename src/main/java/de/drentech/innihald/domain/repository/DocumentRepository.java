package de.drentech.innihald.domain.repository;

import de.drentech.innihald.domain.model.Document;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DocumentRepository implements PanacheRepository<Document> {
}
