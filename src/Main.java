public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Gülperi", "Çetin", "gulpericetin@gmail.com", "147256");
        User user2 = new User(2, "Engin", "Demiroğ", "engin@gmail.com", "741886");
        UserService manager = new UserManager(new UserControlManager(), new HibernateUserDao());

        manager.signUp(user1);
        manager.logIn(user1.geteMail(), user1.getPassword());
        manager.signUp(user2);
    }
}
