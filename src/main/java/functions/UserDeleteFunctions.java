package functions;

import api.UserDeleteApi;

public class UserDeleteFunctions extends UserDeleteApi {
    public static void getUserDelete(String token){
        if (token != null) {
            requestDelete(token);
        } else {
            requestDelete();
        }
    }
}