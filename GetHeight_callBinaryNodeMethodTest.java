import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetHeight_callBinaryNodeMethodTest {

	@Test
	void test1() {
		BinaryTree<String> aTree2 = new BinaryTree<>();
		DriverBT.createTree2(aTree2);
		assertEquals(4, aTree2.getHeight_callBinaryNodeMethod());
	}

}
