package on2013_05.on2013_05_03_Ural_Championship.TaskJ;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2013_05/on2013_05_03_Ural_Championship/TaskJ/TaskJ.task"))
			Assert.fail();
	}
}