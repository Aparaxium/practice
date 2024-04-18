package main

type Node struct {
	value int
	left  *Node
	right *Node
}

func unival(head *Node) int {
	if head == nil {
		return 0
	}
	i := 0
	if head.left == nil && head.right == nil {
		i++
	}
	if head.left != nil && head.right != nil && head.left.value == head.value && head.right.value == head.value {
		i++
	}

	return i + unival(head.left) + unival(head.right)
}
