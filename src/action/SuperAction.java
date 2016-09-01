package action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.deploy.net.HttpResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by li on 2016/8/31.
 */
public class SuperAction extends ActionSupport implements ServletContextAware, ServletRequestAware, ServletResponseAware {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession httpSession;
    protected ServletContext context;

    @Override
    public void setServletRequest(javax.servlet.http.HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
        this.httpSession = request.getSession();
    }

    @Override
    public void setServletContext(javax.servlet.ServletContext servletContext) {
        this.context = servletContext;
    }

    @Override
    public void setServletResponse(javax.servlet.http.HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }
}
