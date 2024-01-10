(ns leetcode-clojure.merge-strings-alternately)

;; 1768. Merge Strings Alternately
;; https://leetcode.com/problems/merge-strings-alternately

(defn merge-alternately [x y]
  (let [merged (apply str (interleave x y))
        append (if (> (count x) (count y)) (subs x (count y)) (subs y (count x)))]
    (apply str merged append)))
 
(comment
  (merge-alternately "abc" "pqr")
  (merge-alternately "ab" "pqrs")
  (merge-alternately "abcd" "pq"))
