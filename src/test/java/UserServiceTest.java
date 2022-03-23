import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
    class UserServiceTest {
        @InjectMocks
        UserService userService;

        @Mock
        UserDao userDao;

        @BeforeEach
        public void setup() {
            userDao = Mockito.mock(UserDao.class);
            userService = new UserService(userDao);
        }

        @Test
        void testAddUser() {
            when(userDao.save()).thenReturn(3);
            int result = userService.addUser("SRIRAM");
            System.out.println("======" + result);
        }

    }