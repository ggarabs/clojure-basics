(ns normal-functions.iterate.bee-1176)

(def fib-seq
  (iterate (fn [[a b]] [b (+ a b)]) [0 1]))

(defn fib [x]
  (first (nth fib-seq x)))
  
  (defn -main [& _]
    (let [t (read-string (read-line))
          cases (take t (repeatedly #(read-string (read-line))))]
      (doseq [x cases]
        (printf "Fib(%d) = %d\n" x (fib x)))))

(-main)