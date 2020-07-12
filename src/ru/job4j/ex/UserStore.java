package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
                break;
            }
        }
       if (result == null) {
            throw new UserNotFoundException("");
       }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        if (user.isValid() && user.getUsername().length() > 3) {
            result = true;
        } else {
            throw new UserInvalidException("");
        }
        return result;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
                 }
            } catch (UserInvalidException e) {
            e.getStackTrace();
            } catch (UserNotFoundException e) {
            e.printStackTrace();
            }
        User[] users2 = {new User("Petr", false)};
        try {
            User user = findUser(users2, "Petr");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
            System.out.println("Пользователь не действительный");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            System.out.println("Подьзователь не обнаружен");
        }
        User[] users3 = {new User("Masha", false)};
        try {
            User user = findUser(users3, "Nika");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
            System.out.println("Пользователь не действительный");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            System.out.println("Подьзователь не обнаружен");
        }
    }
}
