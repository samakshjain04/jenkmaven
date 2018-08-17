package calci;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcacl {
calcu c=new calcu();
	@Test
	public void sumtest() {
		assertEquals(7,c.sum(5, 2));
	}
	
	@Test
	public void subtest() {
		assertEquals(4,c.sub(5, 2));
	}

}
