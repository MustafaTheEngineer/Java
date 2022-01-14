package PostOffice;

public class PostOfficeTest {
    public static void main(String[] args){
        PostOffice office1 = new PostOffice("Office 1");
        PostOffice office2 = new PostOffice("Office 2");

        Post msg = new Post("Değerli Ailem...","Karabük","Adana");

        office2.receive(office1.send(msg));
    }
}
