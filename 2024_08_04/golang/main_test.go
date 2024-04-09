package main

import (
	"testing"
)

func test1(t *testing.T) {
	result := p1([]int{10, 15, 3, 7}, 17)
	if !result {
		t.Fatalf("Expected true %t", result)
	}
}

func test2(t *testing.T) {
	result := p1([]int{10, 15, 3, 7}, 16)
	if result {
		t.Fatalf("Expected false %t", result)
	}
}

func test3(t *testing.T) {
	result := p1([]int{7}, 16)
	if result {
		t.Fatalf("Expected false %t", result)
	}
}

func test4(t *testing.T) {
	result := p1([]int{}, 16)
	if result {
		t.Fatalf("Expected false %t", result)
	}

}
