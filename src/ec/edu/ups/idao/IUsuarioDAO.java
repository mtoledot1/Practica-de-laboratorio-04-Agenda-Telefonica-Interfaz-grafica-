package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author tano
 */
public interface IUsuarioDAO {
    public void create(Usuario usuario);
    public Usuario read(String cedula);
    public void update(Usuario usuario);
    public void delete(Usuario usuario);   
    public List<Usuario> findAll();
}
