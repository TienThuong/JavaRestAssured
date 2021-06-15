package Data;

import Models.TokenUser;

public class DataToken {
    public Object getDataToken(){
        TokenUser tokenUser=new TokenUser();
        tokenUser.setUsername("admin");
        tokenUser.setPassword("password123");
        return  tokenUser;
    }
}
