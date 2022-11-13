
package ca.sait.services;
import ca.sait.models.Role;
import ca.sait.dataaccess.RoleDB;
import java.util.List;

/**
 *
 * @author SixtoDev
 */
public class RoleService {
    public List<Role> getAll() throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll();
        return roles;
    }
}