import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private SILab2 siLab2 = new SILab2();
    private static User user1 = null;
    private static User user2 = new User("anastasija", null, "ana@gmail.com");
    private static User user3 = new User("anastasija", "AnastasijaUser", "taska@gmail.com");
    private static User user4 = new User("anastasija", "user4", "");
    private static User user5 = new User("anastasija", "An#7a$ka", "AN3@gmail.com");
    private static User user6 = new User("anastasija", "An8742", "wick@gmail.com");
    private static User user7 = new User("anastasija", "userpass45$", "");
    private static User user8 = new User("anastasija", "AN$pass", "katastrofa@gmail.com");
    private static User user9 = new User("anastasija", "UserPass", "nisamodavde@gmail.com");
    private static User user10 = new User("anastasija", "taska$@pass", "");
    private static User user11 = new User("anastasija", "nestopasss", "");
    private static User user12 = new User("anastasija", "passwordce!!", "");
    private static List<String> users;

    @BeforeAll
    public static void init() {
        System.out.println("Initializing the expected paramethars ");
        users = new ArrayList<>(12);
    }

    @AfterAll
    public static void destroy() {
        System.out.println("Testing is done");
    }

    @Test
    void EachBranchTest(){
        assertAll(
                () -> assertTrue(assertThrows(RuntimeException.class,
                        () -> siLab2.function(user1, users)).getMessage()
                        .contains("The user is not instantiated")),
             () -> assertTrue(assertThrows(RuntimeException.class,
                       () -> siLab2.function(user2, users))
                       .getMessage().contains("The user is missing some mandatory information")),
                () -> assertFalse(siLab2.function(user3, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertTrue(siLab2.function(user5, users)),
                () -> assertFalse(siLab2.function(user6, users)),
                () -> assertFalse(siLab2.function(user7, users)),
                () -> assertFalse(siLab2.function(user8, users)),
                () -> assertFalse(siLab2.function(user9, users)),
                () -> assertFalse(siLab2.function(user10, users)),
                () -> assertFalse(siLab2.function(user11, users)),
                () -> assertFalse(siLab2.function(user12, users))
        );
    }

    @Test
    void EachPathTest(){
        assertAll(
                () -> assertTrue(assertThrows(RuntimeException.class,
                        () -> siLab2.function(user1, users)).getMessage()
                        .contains("The user is not instantiated")),
                () -> assertTrue(assertThrows(RuntimeException.class,
                        () -> siLab2.function(user2, users))
                        .getMessage().contains("The user is missing some mandatory information")),
                () -> assertFalse(siLab2.function(user3, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertTrue(siLab2.function(user5, users)),
                () -> assertFalse(siLab2.function(user6, users)),
                () -> assertFalse(siLab2.function(user7, users)),
                () -> assertFalse(siLab2.function(user8, users)),
                () -> assertFalse(siLab2.function(user9, users)),
                () -> assertFalse(siLab2.function(user10, users)),
                () -> assertFalse(siLab2.function(user11, users)),
                () -> assertFalse(siLab2.function(user12, users))
        );
    }
}