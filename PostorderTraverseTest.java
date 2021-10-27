import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PostorderTraverseTest {

	@Test
	void test1() {
		BinaryTree<String> aTree1 = new BinaryTree<>();
		DriverBT.createTree2(aTree1);
		assertThrows(EmptyTreeException.class, () -> {aTree1.postorderTraverse(); });
	}
	
	@Test
	void test2() {
		BinaryTree<String> aTree2 = new BinaryTree<>();
		assertThrows(EmptyTreeException.class, () -> {aTree2.postorderTraverse(); });
	}
}
