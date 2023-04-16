package org.cool.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppsTest {
    @Test
    public void mainTest() {
        System.out.println("=== <<TEST>> ===");
    }
}
