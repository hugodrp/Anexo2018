package anexo.dao;

import anexo.model.Anexo2;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuario
 */
@Stateless
public class Anexo2DAO extends AbstractDAO<Anexo2> {

    @PersistenceContext(unitName = "Anexo2018PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Anexo2DAO() {
        super(Anexo2.class);
    }
    
}
