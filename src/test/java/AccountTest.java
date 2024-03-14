import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
        private final String name;
        private final boolean expected;

        public AccountTest(String name, boolean expected) {
            this.name = name;
            this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
            return new Object[][] {
                    {"Alexey Kivilev", true},
                    {"AlexeyKivilev", false},
                    {" Alexey Kivilev", false},
                    {"Alexey Kivilev ", false},
                    {"Al", false},
                    {"Alexanderovich Alexandrov", false}
            };
    }

    @Test
    public void checkNameToEmboss() {
            Account account = new Account(name);
            boolean actual = account.checkNameToEmboss();
            assertEquals(expected, actual);
            System.out.println(actual);
    }
}
