package AVL;

public class AVLTreeAutoTest extends AVLTreeTest {

	public AVLTreeAutoTest() {
		super();
	}

	public static void main(String[] args) throws NodeAlreadyExistsException {
		AVLTreeAutoTest test = new AVLTreeAutoTest();
		AVLTree tree = new AVLTree();

		int[] values = {7, 8, 2, 5, 3, 10, 4 };

		// test insert()
		try {
			print(TESTING_INSERT, true);
			for (int i: values) {
				print(INSERTING + i + ELLIPSIS, false);
				tree.insert(i);
			}
		} catch (Exception e) {
			print(e.toString(), true);
		}

		// test find()
		try {
			print(TESTING_FIND, true);
			for (int i: values) {
				print(FINDING + i + ELLIPSIS, false);
				if (tree.find(i)) {
					print(SUCCESS, true);
				} else {
					print(FAILED, true);
				}
			}
		} catch (Exception e) {
			print(e.toString(), true);
		}
	}
}