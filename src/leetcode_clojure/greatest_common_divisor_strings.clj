(ns leetcode-clojure.greatest-common-divisor-strings)

;; 1071. Greatest Common Divisor of Strings
;; https://leetcode.com/problems/greatest-common-divisor-of-strings

(defn gcd-of-strings [x y]
  (let [shorter (if (<= (count x) (count y)) (apply list x) (apply list y))
        longer (if (= (count x) (count shorter)) (apply list y) (apply list x))
        mega-string (apply str (concat x y))]
    (first (for [i (filter #(and (= (mod (count longer) %) 0) (= (mod (count shorter) %) 0)) (reverse (range 1 (+ 1 (count shorter)))))
                 :when (= mega-string (apply str (apply concat (take (/ (count mega-string) i) (repeat (subs mega-string 0 i))))))] (subs mega-string 0 i)))))

(comment
  (gcd-of-strings "ABCABC" "ABC")
  (gcd-of-strings "ABABAB" "ABAB")
  (gcd-of-strings "LEET" "CODE")
  (gcd-of-strings "EYEEYE" "EYE"))









