package main

import (
	"testing"
)

func Test1(t *testing.T) {
	head := Node{1, &Node{1, nil, nil}, &Node{1, nil, nil}}
	result := unival(&head)
	if result != 3 {
		t.Fatalf("Expected 3, got %d", result)
	}
}

func Test2(t *testing.T) {
	head := Node{1, &Node{1, nil, nil}, &Node{2, nil, nil}}
	result := unival(&head)
	if result != 2 {
		t.Fatalf("Expected 2, got %d", result)
	}
}

func Test3(t *testing.T) {
	head := Node{1, &Node{1, nil, nil}, nil}
	result := unival(&head)
	if result != 1 {
		t.Fatalf("Expected 1, got %d", result)
	}
}

func Test4(t *testing.T) {
	head := Node{1, &Node{1, nil, nil}, nil}
	result := unival(&head)
	if result != 1 {
		t.Fatalf("Expected 1, got %d", result)
	}
}
