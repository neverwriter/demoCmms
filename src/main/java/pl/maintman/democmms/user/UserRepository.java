package pl.maintman.democmms.user;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

@Query("INSERT INTO user VALUES" +
        " (:id," +
        " :email," +
        " :login," +
        " :password," +
        " :role," +
        " :firstName," +
        " :lastName)")
void insert(@Param("id") Long id,
            @Param("firstName") String firstName,
            @Param("lastName") String lastName,
            @Param("email") String email,
            @Param("login") String login,
            @Param("password") Long password,
            @Param("role") String role
            );


//    @Query("INSERT INTO user u VALUES" +
//            " u.id = :id," +
//            " u.first_name = :firstName," +
//            " u.last_name = :lastName," +
//            " u.email = :email," +
//            " u.login = :login," +
//            " u.password = :password," +
//            " u.role = :role")

}
