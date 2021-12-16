import domain.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args) {

        User user1 = new User("junyeong", 26);
        //User user2 = new User("steve", 30);
        User user2 = null;

        try{
            System.out.println("직렬화 하기전 유저의 정보: " + user1.getName());
            FileOutputStream fileOutputStream = new FileOutputStream("./serializationTest.obj");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(user1);
            outputStream.close();
            System.out.println("serialization success");

            FileInputStream fileInputStream = new FileInputStream("./serializationTest.obj");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            user2 = (User) inputStream.readObject();
            System.out.println("직렬화했던 유저의 정보를 역직렬화: " + user2.getName());
            inputStream.close();
        } catch (Exception e){
            System.out.println("error");
        }
    }
}
