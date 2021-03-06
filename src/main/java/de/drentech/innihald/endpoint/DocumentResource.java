package de.drentech.innihald.endpoint;

import de.drentech.innihald.Loggable;
import de.drentech.innihald.domain.model.Document;
import de.drentech.innihald.domain.repository.DocumentRepository;
import io.quarkus.hibernate.orm.panache.PanacheQuery;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

@Produces(MediaType.APPLICATION_XML)
@Path("/document")
public class DocumentResource implements Loggable {

    @Inject
    DocumentRepository documentRepository;

    @GET
    public List<Document> getAllDocument() {

        this.logger().severe("Return all documents");
        return documentRepository.listAll();
    }

    @GET
    @Path("/{id}")
    public String getDocument(Long id) {
        return "Documents";
    }
}
