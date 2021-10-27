import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetNumberOfNodesTest {

	@Test
	void test1() {
		BinaryTree<String> aTree2 = new BinaryTree<>();
		DriverBT.createTree2(aTree2);
		assertEquals(8, aTree2.getNumberOfNodes());
	}

}
