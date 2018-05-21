package ClothindData;

import Models.MensClothing;
import Models.WomensClothing;
import Queries.ClothingQueries;
import RDF.RDFController;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import java.io.File;
import java.io.FileInputStream;


public class ClothingModel {

    private String file = "src/ClothindData/semcloth.ttl";

    public ClothingModel() {
        readModel();
    }


    /**
     * Reads the model
     * @return the model
     */
    public Model readModel() {
        Model model = ModelFactory.createDefaultModel();
            model.read(new File(file).toURI().toString(), "Turtle");
        return model;
    }
}

//"/Users/Mats/IdeaProjects/INFO216.SemCBOW/src/ClothingOntology/semcloth.ttl"), "http://www.semanticweb.org/ontologies/2015/02/semcloth.owl#", "TURTLE"