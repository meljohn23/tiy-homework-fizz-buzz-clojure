(ns tiy-homework-fizz-buzz-clojure.core)

(defn fizz-buzz [start end]
  (loop [start start
         end end
         accumulator ""]

  (if (<= start end)
    (cond
        (= 0 (mod start 15)) (recur (+ start 1) end (str accumulator " FizzBuzz" "\n"))
        (= 0 (mod start 3)) (recur (+ start 1) end (str accumulator " Fizz"))
        (= 0 (mod start 5)) (recur (+ start 1) end (str accumulator " Buzz"))
        :else  (recur (+ start 1) end (str accumulator " " start )))
    accumulator)))

  (defn -main []
    (fizz-buzz 1 100))

(println (-main))