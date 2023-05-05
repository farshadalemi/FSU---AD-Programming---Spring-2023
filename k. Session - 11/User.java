public class User {
    public static void main(String[] args){
        UserInterface id1 = new UserInterface("Farshad");
        UserInterface id2 = new UserInterface("Farhad");
        UserInterface id3 = new UserInterface("Farshid");
        UserInterface id4 = new UserInterface("Farzad");
        UserInterface id5 = new UserInterface("Farnood");
        
        System.out.println("-----------------------------");
   
        int totalUsers = UserInterface.getNumberOfusers();
        System.out.println("Total number of users: " + totalUsers);
        
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(id4);
        System.out.println(id5);

        System.out.println("-----------------------------");

    }
    
}
