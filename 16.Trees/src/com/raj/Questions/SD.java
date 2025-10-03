package com.raj.Questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
public class SD {
    public List<String> serialize(Node node) {
        List<String> list = new ArrayList<>();
        helper(node, list);
        return list;
    }

    private void helper(Node node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);
    }

    Node deserialize(List<String> list) {
        Collection.reverse(list);
        Node node = helper2(list);
        return node;
    }

    private Node helper2(List<String> list) {
        String val = list.remove(list.size() - 1);

        if (val.charAt(0) == 'n') {
            return null;
        }

        Node node = new Node(Integer.parseInt(val));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }

    // ab us string list ko string me convert karna hai final submission k liye
}
