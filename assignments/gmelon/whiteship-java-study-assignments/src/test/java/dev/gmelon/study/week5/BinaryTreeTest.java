package dev.gmelon.study.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeTest {

    public static Node root;

    @BeforeEach
    void setUp() {
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node4 = new Node(node8, node9, 4);
        Node node5 = new Node(5);
        Node node2 = new Node(node4, node5, 2);
        Node node3 = new Node(node6, node7, 3);
        root = new Node(node2, node3, 1);
    }

    @Test
    void bfs() {
        List<Integer> result = BinaryTree.bfs(root);
        assertThat(result).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void dfs() {
        List<Integer> result = BinaryTree.dfs(root);
        assertThat(result).containsExactly(8, 4, 9, 2, 5, 1, 6, 3, 7);
    }
}