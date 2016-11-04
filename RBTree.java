package sjsu.Nguyen.cs146.project2;

/**
 * Created by Philip on 10/27/2016.
 */
public class RBTree {

    /*** PROPERTIES ***/
    private TreeNode root;

    /***********************************************************************************************************/
    /*********************************** TREENODE CLASS for the RBTREE *****************************************/
    /***********************************************************************************************************/
    protected class TreeNode
    {
        /*** PROPERTIES ***/
        private char data;
        private int color; //1 = black, 0 = red
        private TreeNode left, right, parent;

        /*** CONSTRUCTORS ***/
        public TreeNode()
        {

            this.color = 0;
            this.right = null;
            this.left = null;
        }
        public TreeNode(char data)
        {
            this.data = data;
            this.color = 0;
            this.left = null;
            this.right = null;
        }

        /*** GETTERS ***/
        public char getData() { return this.data; }
        public int getColor(){ return this.color; }
        public TreeNode getRight() { return this.right; }
        public TreeNode getLeft() { return this.left; }

        /*** SETTERS ***/
        public void setData(char d){ this.data = d; }
        public void setColor(int c){ this.color = c; }
        public void setRight(TreeNode r){ this.right = r; }
        public void setLeft(TreeNode l){ this.left = l;}

        public void addNode(String s)
        {

        }
        public void print()
        {
            System.out.print(this.data + " ");
        }
    }
    /***********************************************************************************************************/
    /***************************************** END of TreeNode class *******************************************/
    /***********************************************************************************************************/

    /***********************************************************************************************************/
    /************************************ VISITOR INTERFACE for the RBTREE *************************************/
    /***********************************************************************************************************/
      public static interface Visitor
      {
      	/**
         This method is called at each node.
         @param n the visited node
      	 */
      	void visit(TreeNode n);
      }

     public void preOrderVisit(Visitor v)
      {
      	preOrderVisit(root, v);
      }

     private static void preOrderVisit(TreeNode n, Visitor v)
      {
      	if (n == null) return;
      	v.visit(n);
      	preOrderVisit(n.left, v);
      	preOrderVisit(n.right, v);
      }
    /***********************************************************************************************************/
    /**************************************** END of Visitor Interface *****************************************/
    /***********************************************************************************************************/

    /***********************************************************************************************************/
    /********************************************* RBTREE METHODS **********************************************/
    /***********************************************************************************************************/
    /*** CONSTRUCTORS FOR RBTREE ***/
    public RBTree() { this.root = null; }
   // public RBTree(String ) {}

    public TreeNode getRoot(){ return root; }

    public boolean isEmpty()
    {
        return root == null;
    }

    /*** Prints the tree in preorder ***/
    public void printTree()
    {
        preorder(root);
    }
    public void preorder(TreeNode node)
    {
        if(node != null)
            System.out.println(node.getData() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
    }
    /*** End of print ***/

    public void insert(char element)
    {

        /*
        TreeNode newNode = new TreeNode(element);
        class myVisitor implements Visitor
        {
            public TreeNode pointer;
            public void visit(TreeNode n){
                pointer = n;
            }
        }

        if(root == null)
            root = new TreeNode(element);
        else
        {
            if(element <= root.getData())

        }

       // MyVisitor v = new MyVisitor();
       // if(element <= v.visit() )*/
    }

    /***********************************************************************************************************/
    /********************************************* END of RBTree Methods **********************************************/
    /***********************************************************************************************************/
}
