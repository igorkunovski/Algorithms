public class RBTree {

    private Node root;

    public boolean add(int value){

        // Обработка корневой ноды (root). Всегда черная.

        if (root != null){
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, int value){

        // если в дереве присутствует значение value, то новую ноду не создать.

        if (node.value == value) return false;

            // подбирается подходящее место для добавления (по левым и правым детям)

        else {
            if (node.value > value) {
                if (node.leftChild != null) {
                    boolean result = addNode(node.leftChild, value);

                    // после добавления ноды при выходе из рекурсии проверяется необходимость ребаланса и проведение его при необходимости

                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else {

                    // добавление новой ноды

                    node.leftChild = new Node();
                    node.leftChild.color = Color.RED; // новая нода всегда красная
                    node.leftChild.value = value;
                    return true;
                }
            } else {
                if (node.rightChild != null){
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return  result;
                } else{
                    node.rightChild = new Node();
                    node.rightChild.color = Color.RED;
                    node.rightChild.value = value;
                    return true;
                }
            }
        }
    }

    private Node rebalance(Node node){

        // Ребаланс происходит в 3-х случаях

        Node result = node;
        boolean needRebalance;
        do{
            needRebalance = false;

            // 1. если правый ребенок красный и левый ребенок черный - правый поворот.

            if (result.rightChild != null && result.rightChild.color == Color.RED &&
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)){
                needRebalance = true;
                result = rightSwap(result);
            }

            // 2. если левый ребенок красный и у левого ребенка есть красный левый ребенок - левый поворот.

            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.leftChild.leftChild !=null && result.leftChild.leftChild.color == Color.RED){
                needRebalance = true;
                result = leftSwap(result);
            }

            // 3. если и правый и левый ребенок красные - замена цвета. Всегда после правого поворота.

            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.rightChild != null && result.rightChild.color == Color.RED){
                needRebalance = true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }

    private Node rightSwap(Node node){

        // правый поворот

        Node rightChild = node.rightChild;
        Node middleChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = middleChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private Node leftSwap(Node node){

        // левый поворот

        Node leftChild = node.leftChild;
        Node middleChild = leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = middleChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    private void colorSwap(Node node){

        // Ситуация когда у ноды 2 красных ребенка. Root обрабатывается отдельно. Он всегда черный

        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    private static class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;
    }

    private enum Color{
        RED, BLACK
    }
}
