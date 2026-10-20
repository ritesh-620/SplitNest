package in.ritesh.splitnest.repository;

import in.ritesh.splitnest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
