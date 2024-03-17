#include <stdio.h>
#include <stdlib.h>

typedef struct BinaryNode {
    int value;
    struct BinaryNode *left;
    struct BinaryNode *right;
} BinaryNode;

typedef struct BinaryTree {
    uint size;
    struct BinaryNode *head;
} BinaryTree;

BinaryTree build_tree() {
    BinaryTree tree = {.size = 0, .head = NULL};
    return tree;
}

void node_insert(BinaryNode *node, BinaryNode *term) {
    if (term->value <= node->value) {
        if (node->left == NULL) {
            node->left = term;
        } else {
            node_insert(node->left, term);
        }
    } else {
        if (node->right == NULL) {
            node->right = term;
        } else {
            node_insert(node->right, term);
        }
    }
}

void tree_insert(BinaryTree *tree, BinaryNode *node) {
    if (tree->head == NULL) {
        tree->head = node;
    } else {
        node_insert(tree->head, node);
    }
    tree->size++;
}

uint _pre_order_walk(BinaryNode *node, BinaryNode *path[], uint index) {
    // Pre
    path[index] = node;
    index++;

    if (node->left != NULL) {
        index = _pre_order_walk(node->left, path, index);
    }
    // In

    if (node->right != NULL) {
        index = _pre_order_walk(node->right, path, index);
    }
    // Post
    return index;
}

void depth_pre_order_walk(BinaryTree *tree, BinaryNode *path[]) {
    _pre_order_walk(tree->head, path, 0);
}

int _in_order_walk(BinaryNode *node, BinaryNode *path[], int index) {
    // Pre

    if (node->left != NULL) {
        index = _in_order_walk(node->left, path, index);
    }
    // In

    path[index] = node;
    index++;

    if (node->right != NULL) {
        index = _in_order_walk(node->right, path, index);
    }
    // Post
    return index;
}

void depth_in_order_walk(BinaryTree *tree, BinaryNode *path[]) {
    _in_order_walk(tree->head, path, 0);
}

int main(int argc, char *argv[]) {

    BinaryTree tree = build_tree();

    BinaryNode ten = {.value = 10};
    BinaryNode three = {.value = 3};
    BinaryNode four = {.value = 4};
    BinaryNode thirty = {.value = 30};

    tree_insert(&tree, &ten);
    tree_insert(&tree, &three);
    tree_insert(&tree, &four);
    tree_insert(&tree, &thirty);

    uint path_length = 4;
    BinaryNode *path[path_length];

    depth_pre_order_walk(&tree, path);

    for (int x = 0; x < path_length; x++) {
        printf("%d\n", path[x]->value);
    }

    return EXIT_SUCCESS;
}
