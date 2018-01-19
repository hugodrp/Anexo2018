package anexo.controller;

import anexo.dao.Anexo2DAO;
import anexo.model.Anexo2;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author usuario
 */
@Named(value = "anexo2Controller")
@SessionScoped
public class Anexo2Controller implements Serializable {

    @EJB
    private Anexo2DAO dao;
    private Anexo2 selected;

    // ---------------------- Constructor de la Clase ----------------------
    public Anexo2Controller() {
    }

    public Anexo2 getSelected() {
        if (selected == null) {
            selected = new Anexo2();
        }
        return selected;
    }

    // ---------------------- Métodos del Managed Bean ----------------------
    public List<Anexo2> listado() {
        return dao.findAll();
    }
}
