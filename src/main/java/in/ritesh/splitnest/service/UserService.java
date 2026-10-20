package in.ritesh.splitnest.service;

import in.ritesh.splitnest.entity.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
}
