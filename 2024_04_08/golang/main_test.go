package main

import (
	"testing"
)

func Test1(t *testing.T) {
	result := p1([]int{10, 15, 3, 7}, 17)
	if !result {
		t.Fatalf("Expected true %t", result)
	}
}

func Test2(t *testing.T) {
	result := p1([]int{10, 15, 3, 7}, 16)
	if result {
		t.Fatalf("Expected false %t", result)
	}
}

func Test3(t *testing.T) {
	result := p1([]int{7}, 16)
	if result {
		t.Fatalf("Expected false %t", result)
	}
}

func Test4(t *testing.T) {
	result := p1([]int{}, 16)
	if result {
		t.Fatalf("Expected false %t", result)
	}

}
