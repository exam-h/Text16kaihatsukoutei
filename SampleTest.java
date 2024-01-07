
package hello.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SampleTest {
	@Nested
	class getColor {
		@Test
		void success() {
			assertEquals("赤", JunitSample.getColor(1));
			assertEquals("緑", JunitSample.getColor(2));
			assertEquals("青", JunitSample.getColor(3));
		}

		@Test
		@DisplayName("引数エラー")
		void fail() {
			// assertThrows メソッドを使って例外を検証する
			assertThrows(IllegalArgumentException.class, () -> JunitSample.getColor(99));
			
		}
	}

}