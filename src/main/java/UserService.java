public class UserService {
    public UserDao userDao;
    public UserService(UserDao userDao){

        this.userDao=userDao;
    }
    public int addUser(String name){
        System.out.println("this is user = "+name);
        return(userDao.save());
    }
}
