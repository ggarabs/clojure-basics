(ns macros.cond.bee-1151-v2)

(def fib
  (memoize
   (fn [n]
     (cond
       (zero? n) 0
       (= 1 n) 0
       (= 2 n) 1
       :else (+ (fib (dec n))
                (fib (- n 2)))))))

(defn -main [& _]
  (let [n (-> (read-line) (Integer/parseInt))]
    (doseq [x (range 1 n)]
      (print (format "%d " (fib x))))
    (println (fib n))))

(-main)
