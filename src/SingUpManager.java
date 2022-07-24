public class SingUpManager implements SingUpService{
    @Override
    public void signUp(String email) {
        System.out.println("Giriş Başarılı :" +email);
    }

    @Override
    public void signUpIsFail() {
        System.out.println("Giriş Başarısız :");
    }
}
