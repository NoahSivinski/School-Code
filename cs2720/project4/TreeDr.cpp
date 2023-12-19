// Test driver
#include "TreeType.h"

TreeType *makeTree(int arr[], int size);
TreeType *treeMaker(TreeType *tree, int arr[], int size);
  
int main()
{
	string command; // operation to be executed

	int item;
	TreeType tree;
	//bool found;
	ifstream inFile;
	inFile.open("input.txt");
	ofstream outFile;
	outFile.open("output.txt");
	inFile >> command;

	while (command != "Quit")
	{
		//1
		if (command == "PutItem")
		{
			inFile >> item;
			tree.putItem(item);
			outFile << item;
			outFile << " is inserted" << endl;
		}
		//2
		else if (command == "DeleteItem")
		{
			inFile >> item;
			tree.deleteItem(item, outFile);
		}
		//3
		else if (command == "GetLength")
		{
			outFile << "Number of nodes is " << tree.getLength() << endl;
		}
		//4
		else if (command == "IsEmpty")
			if (tree.isEmpty())
				outFile << "Tree is empty." << endl;
			else
				outFile << "Tree is not empty." << endl;
		//5
		else if (command == "Print")
		{
			outFile << "Printing the tree...InOrder Traversal\n";
			tree.print(outFile);
		}
		//6
		else if (command == "PreOrderPrint")
		{
			outFile << "PreOrder Print:\n";
			tree.preOrderPrint(outFile);
		}
		//7
		else if (command == "PostOrderPrint")
		{
			outFile << "PostOrder Print:\n";
			tree.postOrderPrint(outFile);
		}
		//8
		else if (command == "LevelOrderPrint")
		{
			outFile << "LevelOrder Print:\n";
			tree.levelOrderPrint(outFile);
		}
		//9
		else if (command == "MakeEmpty")
		{
			tree.makeEmpty();
			outFile << "Tree has been made empty." << endl;
		}
		//10
		else if (command == "PrintAncestorsOf")
		{
			inFile >> item;
			outFile << "testing Ancestors of " << item << endl;
			tree.printAncestors(item, outFile);
		}
		//11
		else if (command == "MirrorImage")
		{
			outFile << "Testing Mirror Image\n";
			tree.makeEmpty();
			tree.putItem(10);
			tree.putItem(13);
			tree.putItem(5);
			tree.putItem(4);
			tree.putItem(7);
			tree.putItem(12);
			tree.putItem(20);
			outFile << "Original Tree before mirroring:\n";
			tree.levelOrderPrint(outFile);
			TreeType mirrorOftree;
			tree.mirrorImage(mirrorOftree);
			outFile << "Original Tree After Mirroring:\n";
			tree.levelOrderPrint(outFile);
			outFile << "Mirror Image:\n";
			mirrorOftree.levelOrderPrint(outFile);
		}
		//12
		else if (command == "MakeTree")
		{

			int array[100], length;
			inFile >> length;
			for (int i = 0; i < length; i++)
			{
				inFile >> array[i];
			}

			TreeType *balancedTree = makeTree(array, length);
			outFile << "balancedTree.LevelOrderPrint()\n";
			balancedTree->levelOrderPrint(outFile);
			outFile << "balancedTree.InOrderPrint()\n";
			balancedTree->print(outFile);
			delete balancedTree;
		}
		else
			outFile << "Undefined Command!" << command << endl;
		inFile >> command;
	}
	cout << "Testing completed." << endl;

	return 0;
}

TreeType *makeTree(int arr[], int size)
// implement this function
// you may define and call helper functions.
{
  TreeType *balancedTree = new TreeType;
  
  int mid = 0;
  if (size % 2 == 1)
    mid = size / 2;
  else
    mid = size / 2 - 1;
  /*
  int *front[];// = new int[mid];
  int *back[];// = new int[size-mid-1];
  for (int i = 0; i < mid; i++) {
    front[i] = arr[i];
  } // for
  for (int i = 0; i < size -mid; i++) {
    back[i] = arr[i + mid + 1];
  } // for

  balancedTree = treeMaker(balancedTree, front, mid);
  balancedTree = treeMaker(balancedTree, back, size-mid-1);
  return balancedTree;
  */
  
  balancedTree->putItem(arr[mid]);
  for (int i = 0; i < mid; i++) {
    balancedTree->putItem(arr[i]);
  } // for
  for (int i = mid + 1; i < size; i++) {
    balancedTree->putItem(arr[i]);
  } // for
   
  return balancedTree;
  
} // makeTree

// helper function for makeTree
TreeType* treeMaker(TreeType *tree, int arr[], int size) {
  int mid;// = (size + ((size - 1) % 2)) / 2;
  if (size % 2 == 1)
    mid = size / 2;
  else
    mid = size / 2 - 1;
  //TreeNode node = new Node();
  
  
   tree->putItem(arr[mid]);

     
   //node.left = treeMaker(tree, arr, mid);
   
   //   node.right = treeMaker(tree, arr, mid);
   return tree;

   for (int i = mid; i > 0; i--) {
     treeMaker(tree, arr, mid);
   } // for
     
} // treeMaker

