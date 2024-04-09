use std::collections::HashMap;

pub fn p1(a: &[i32], k: i32) -> bool {
    let mut map = HashMap::new();
    for ele in a.iter() {
        if map.contains_key(&(k - ele)) {
            return true;
        }
        map.insert(ele, true);
    }
    return false;
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test1() {
        let x = [10, 15, 3, 7];
        assert_eq!(p1(&x, 17), true);
    }
}
