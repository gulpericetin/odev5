import java.util.List;

public class HibernateUserDao implements UserDao{

    @Override
    public void add(User user) {
        System.out.println("Hibernatele eklendi: " + user.getFirstName());
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
