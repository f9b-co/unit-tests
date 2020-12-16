package fr.formation.training.unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * User avec un username et le username est obligatoire.
 */
public class UserUT {
    // Pour lancer le test sur la classe :
    // Run As... JUnit Test
    // Pour lancer lacouverture sur la classe :
    // Coverage As... JUnit Test

    @Test
    void should_create_user_with_non_null_username() {
	User actual = new User("Frank");
	assertNotNull(actual);
    }

    @Test
    void should_throw_illegal_argument_with_null_username() {
	assertThrows(IllegalArgumentException.class, () -> new User(null));
    }

    @Test
    void should_get_non_null_username() {
	User user = new User("Frank");
	String actual = user.getUsername();
	assertNotNull(actual);
    }

    @Test
    void should_get_equal_username() {
	String expected = "Frank";
	User user = new User(expected);
	String actual = user.getUsername();
	assertEquals(actual, expected);
    }
}
