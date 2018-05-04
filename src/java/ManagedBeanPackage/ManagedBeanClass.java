package ManagedBeanPackage;

import entity.User;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sessionPackage.SessionClass;



@ManagedBean
@SessionScoped
public class ManagedBeanClass {

    @EJB
    SessionClass sc;
    private String name;
    private String suRname;
    private String email;

    public SessionClass getSc() {
        return sc;
    }

    public void setSc(SessionClass sc) {
        this.sc = sc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuRname() {
        return suRname;
    }

    public void setSuRname(String suRname) {
        this.suRname = suRname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String registerUser() {
        User user = new User();
        user.setName(this.getName());
        user.setSurrame(this.getSuRname());
        user.setEmail(this.getEmail());
        boolean resutl = sc.insertUser(user);
        if (resutl) {
            return "success";
        } else {
            return "formjsf";
        }
    }
    
}
