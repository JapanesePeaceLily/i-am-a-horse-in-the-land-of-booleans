(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (if (teen? age)
    false
    true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (vector? x) (* (count x) 2)
    (list? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (if (and (= 0 (mod year 4))
           (or (not= 0 (mod year 100))
               (= 0 (mod year 400))))
    true
    false))

(leap-year? 200)

; '_______'
