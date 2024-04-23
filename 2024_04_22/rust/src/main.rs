use rand::prelude::*;
use assert_approx_eq::assert_approx_eq;

pub fn estimate_pi(k: i32, radius: f64) -> f64 {
    let  (mut inside, mut total) = (0.0, 0.0);
    let mut x: f64;
    let mut y: f64;
    let mut rng = rand::thread_rng();

    for _ in 0..k {
        x = rng.gen_range(0.0..radius);
        y = rng.gen_range(0.0..radius);
        if x * x + y * y <= radius * radius{
            inside += 1.0;
        }
        total += 1.0;
    }
    return 4.0 * inside / total;
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test1() {
        let result = estimate_pi(20000000, 1.0);
        assert_approx_eq!(result, 3.141, 1e-3);
    }
    #[test]
    fn test2() {
        let result = estimate_pi(20000000, 11.25);
        assert_approx_eq!(result, 3.141, 1e-3);
    }
    #[test]
    fn test3() {
        let result = estimate_pi(20000000, 0.1);
        assert_approx_eq!(result, 3.141, 1e-3);
    }
}
