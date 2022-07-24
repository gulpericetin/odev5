import java.util.List;

public interface UserService {
    void signUp(User user);

    void logIn(String email, String password);

    List<User> getAll();
}
