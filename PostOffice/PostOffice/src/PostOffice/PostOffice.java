package PostOffice;

public class PostOffice {
    private String name;

    PostOffice(String name){
        this.name = name;
    }

    Post send(Post post){
        return post;
    }
    Post receive(Post post){
        return post;
    }

}
