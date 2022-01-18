package modals;

public class Account {

    String accountName;
    String webSite;
    String type;

    public Account(String accountName, String webSite, String type){
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
    }

    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public String getWebSite(){
        return webSite;
    }

    public void setWebSite(String webSite){
        this.webSite = webSite;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
