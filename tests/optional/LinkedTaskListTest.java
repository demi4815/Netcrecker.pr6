package ua.edu.sumdu.ta.Karina.pr6.tests.optional;

import org.junit.Before;
import ua.edu.sumdu.ta.Karina.pr6.*;

public class LinkedTaskListTest extends TaskListTest {

    @Before
    public void before()
    {
        tasks = new LinkedTaskList();
    }
}
