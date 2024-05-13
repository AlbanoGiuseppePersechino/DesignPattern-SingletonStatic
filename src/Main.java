public class Main {
    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User("Albano Persechino", 27);
        }
        return user;
    }

    public static void main(String[] args) {
        User user1 = getUser();
        System.out.println("Stamp default user=");
        user1.stampUser();

        User user2 = getUser();
        user2.setName("Andrea Bianchi");
        user2.setAge(24);

        System.out.println("Stamp user whit changes=");
        user2.stampUser();
    }
}