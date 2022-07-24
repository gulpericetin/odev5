public interface EmailService {
    void sendVerifyEmail(String email);
    void isEmailActivated(String email);
}
