package tests;

import model.User;

public class UserTests {

	public static void main(String[] args) {
			User testUser = new User("mike", "my_passwd", "Mike", "Smith", "0771234567");

			System.out.println(testUser);
	}

}
