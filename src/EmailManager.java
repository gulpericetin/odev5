public class EmailManager implements EmailService{
    @Override
    public void sendVerifyEmail(String email) {
        System.out.println("Email aktivasyon mesajı :" +email);
    }

    @Override
    public void isEmailActivated(String email) {
        System.out.println("Email aktivasyonu :"+email);
    }
}
