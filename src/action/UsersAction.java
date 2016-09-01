package action;

import com.opensymphony.xwork2.ModelDriven;
import entity.UserEntity;
import org.apache.struts2.interceptor.validation.SkipValidation;
import service.UsersDAO;
import serviceimpl.UsersDaoImpl;

/**
 * Created by li on 2016/8/31.
 */
public class UsersAction extends SuperAction implements ModelDriven<UserEntity> {
    private UserEntity userEntity = new UserEntity();

    @Override
    public UserEntity getModel() {
        System.out.println(userEntity.toString());
        return userEntity;
    }

    //用户登录
    public String login() {
        UsersDAO usersDAO = new UsersDaoImpl();
        System.out.println(userEntity.toString());
        if (usersDAO.userLogin(userEntity)) {
            /**
             * 登录成功在session中保存
             *
             */
            httpSession.setAttribute("loginusername", userEntity.getUname());
            return "login_success";
        } else {
            return "login_failure";
        }
    }

    //    退出登录
    public String logout() {
        if (httpSession.getAttribute("loginusername") != null) {
            httpSession.removeAttribute("loginusername");
        }

        return "logout_success";
    }

    @SkipValidation
    @Override
    public void validate() {
//   用户名不能为空
        if (userEntity.getUname() == null || userEntity.getUname().trim().equals("")) {
            this.addFieldError("usernameerror", "用户名称不能为空");

        }
    }
}
