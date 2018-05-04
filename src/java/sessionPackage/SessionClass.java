package sessionPackage;

import entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SessionClass {
     @PersistenceContext
    private EntityManager em;
    
public boolean insertUser(User user) {
        try {
            this.em.persist(user);
            this.em.flush();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
