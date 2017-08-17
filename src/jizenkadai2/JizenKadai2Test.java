package jizenkadai2;

import static org.junit.Assert.*;

import org.junit.Test;

public class JizenKadai2Test {

	@Test
	public void testConvert() {
		Arab num = new Arab();
		assertEquals("Ⅳ" , num.convert(4));
		assertEquals("ⅩⅡ" , num.convert(12));
		assertEquals("変換できません" , num.convert(-3));
		assertEquals("変換できません" , num.convert(31));
	}
}
