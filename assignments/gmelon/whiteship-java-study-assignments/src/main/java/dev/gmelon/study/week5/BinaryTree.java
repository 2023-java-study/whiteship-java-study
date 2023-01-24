package dev.gmelon.study.week5;

import java.util.*;

public class BinaryTree {

    public static List<Integer> bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        if (node != null) {
            queue.offer(node);
        }

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            result.add(currentNode.value()); // visit
            if (currentNode.leftChild() != null) {
                queue.offer(currentNode.leftChild());
            }
            if (currentNode.rightChild() != null) {
                queue.offer(currentNode.rightChild());
            }
        }
        return result;
    }

    public static List<Integer> dfs(Node node) {
        Stack<Node> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        Node currentNode = node;
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.leftChild();
            }
            else {
                currentNode = stack.pop();
                result.add(currentNode.value()); // visit
                currentNode = currentNode.rightChild();
            }
        }
        return result;
    }

}
