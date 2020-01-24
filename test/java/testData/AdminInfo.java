package testData;

public class AdminInfo {
    public AdminInfo(){
        createAdmin();
    }
    private static String login;
    private static String password;

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        AdminInfo.login = login;
    }

    public static String getPasswrd() {
        return password;
    }

    public static void setPassword(String password) {
        AdminInfo.password = password;
    }
    public static void createAdmin() {
        setLogin("admin@phptravels.com");
        setPassword("demoadmin");
    }
}
