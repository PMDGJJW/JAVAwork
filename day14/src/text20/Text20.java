package text20;

public class Text20 {
    public static void login(String U ,String P){
        if (!U.equals("admin")){
            try {
                throw  new LoginException();
            } catch (LoginException e) {
                System.out.println("用户名不存在");
            }
        }
        if (!P.equals("123")){
            try {
                throw  new LoginException();
            } catch (LoginException e) {
                System.out.println("密码错误。");
            }
        }
        if (U.equals("admin")&&P.equals("123")){
            System.out.println("欢迎："+U);
        }
    }
    public static void main(String[] args) {
        login("admin","123");
    }

}
