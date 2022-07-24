public class GoogleSingUpAdapter implements SingUpService{
    @Override
    public void signUp(String email) {
        GoogleManager service = new GoogleManager();
        service.signInSucces();
    }

    @Override
    public void signUpIsFail() {
        GoogleManager service = new GoogleManager();
        service.errorSignIn();

    }
}
