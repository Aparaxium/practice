package main

func p1(a []int, k int) bool {
	m := make(map[int]bool)
	for _, e := range a {
		if m[k-e] {
			return true
		} else {
			m[e] = true
		}
	}
	return false
}
