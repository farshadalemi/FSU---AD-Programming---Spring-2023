public class UserInterface {
    
    private String username;
    private int id;
    private static int numberOfUsers = 0;


    public UserInterface(String newUsername){
        username = newUsername;
        id = numberOfUsers;
        numberOfUsers++;
    }

    public static int getNumberOfusers(){
        return numberOfUsers;
    }

    public String toString(){
        return username + " ID: " + id;
    }
}
