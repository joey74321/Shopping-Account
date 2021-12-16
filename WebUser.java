public class WebUser extends Customer{
    private String login_id;
    private String password;
    private UserState state;

//constructor
    public WebUser(){
        super();
        this.login_id = "";
        this.password = "";
        this.state = UserState.New;
    }

//The following constructor takes in values via parameters
    public WebUser(String web_login_id, String web_password){
        this.login_id = web_login_id;
        super.setId(web_login_id);
        this.password = web_password;
        this.state = UserState.New;

    }

//getters
    public String getPassword() {
        return password;
    }

    public UserState getState() {
        return this.state;
    }

//setters
    public void setPassword(String pw){
    this.password = pw;
}

    public void setNew(){
        this.state = UserState.New;
    }

    public void setActive() {
        this.state = UserState.Active;
    }

    public void setBlocked() {
        this.state = UserState.Blocked;
    }

    public void setBanned() {
        this.state = UserState.Banned;
    }

    public String toString(){
        return "Web User ID: " + login_id + "\nUser State: " + state;

    }
}
