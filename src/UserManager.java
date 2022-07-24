import java.util.List;

public class UserManager implements UserService{
    UserControlManager userControlManager;
    UserDao userDao;
    public UserManager(UserControlManager userControlManager, UserDao userDao) {
        super();
        this.userControlManager = userControlManager;
        this.userDao = userDao;
    }

    @Override
    public void signUp(User user) {
        if (userControlManager.isValidUser(user)) {
            System.out.println("Kullanıcı sisteme kaydoldu: " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Kullanıcıya doğrulama epostası gönderilmiştir.\nÜyelik tamamlandı.");
            this.userDao.add(user);
        } else {
            System.out.println("Kullanıcı kayıt işlemi başarısız!");
        }
    }

    @Override
    public void logIn(String email, String password) {
        if (userControlManager.userEmails.contains(email) && password.length() >= 6) {
            System.out.println("Kullanıcı girişi başarılı: " + email);
        } else {
            System.out.println("Hatalı bilgi girişi!");
        }
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
