namespace c_;

public class Main {
	public static void main() {
		System.Console.WriteLine("Hello World!");
	}
	public static bool p1(int[] a, int k) {
		Dictionary<int, bool> map = new Dictionary<int, bool>();
		foreach (int element in a) {
			if (map.ContainsKey(k - element)) {
				return true;
			}
			map.Add(element, true);
		} 
		return false;
	}
}
