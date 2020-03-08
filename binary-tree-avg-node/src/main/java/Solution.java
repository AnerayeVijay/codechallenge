import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/***
 * Input:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Output: [3, 14.5, 11]
 */
public class Solution {

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        root.left.left = new Node(21);
        root.left.right = new Node(8);
        System.out.println(getAvgOfNode(root));

    }

    public static List<Double> getAvgOfNode(Node root) {
        final List<Double> result = new ArrayList<>();
        final LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            final int count = queue.size();
            double sum=0;
            for(int i=0;i<count;i++) {
                final Node p = queue.poll();
                sum+= p.value;
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
            }
            result.add(sum/count);

        }
        return result;

    }
}
class Node {
    int value;
    Node left,right;
    Node(int value) {
        this.value = value;
    }
}