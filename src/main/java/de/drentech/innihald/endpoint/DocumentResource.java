package de.drentech.innihald.endpoint;

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
public class DocumentResource {

    @Inject
    DocumentRepository documentRepository;

    private static final Logger LOG = Logger.getLogger(String.valueOf(DocumentResource.class));

    @GET
    public List<Document> getAllDocument() {

        return documentRepository.listAll();
    }

    @GET
    @Path("/{id}")
    public String getDocument(Long id) {
        return "Documents";
    }
}
