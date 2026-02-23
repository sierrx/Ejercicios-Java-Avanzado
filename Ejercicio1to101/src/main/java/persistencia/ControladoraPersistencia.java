
package persistencia;

import model.Director;
import model.Oficina;


public class ControladoraPersistencia {
    OficinaJpaController oficinaJpa = new OficinaJpaController();
    DirectorJpaController directorJpa = new DirectorJpaController();
    

    public void crearOficina(Oficina oficina) {
        oficinaJpa.create(oficina);
    }
    
    public void crearPropietario(Director director) {
        directorJpa.create(director);
    }
}
