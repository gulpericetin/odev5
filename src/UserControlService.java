public interface UserControlService {
    boolean checkFirstName(User user);

    boolean checkLastName(User user);

    boolean checkEmail(User user);

    boolean checkPassword(User user);

    boolean isValidUser(User user);

}
