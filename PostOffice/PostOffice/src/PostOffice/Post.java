package PostOffice;

public class Post {
    private String message;
    private String sourceAdress;
    private String targetAdress;

    Post(String message,String sourceAdress,String targetAdress){
        this.message = message;
        this.sourceAdress = sourceAdress;
        this.targetAdress = targetAdress;
    }
}
