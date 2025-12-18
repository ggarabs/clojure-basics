(ns bee-1151)

(defn fib [x]
  (cond
    (= x 1) 0
    (= x 0) 0
  :else
  (loop [it 2
         last 1
         llast 0]
    (if (= it x) last 
        (recur (inc it) (+ last llast) last)))))

(defn -main [& _]
  (let [n (-> (read-line) (Integer/parseInt))]
    (doseq [x (range 1 n)]
      (print (format "%d " (fib x))))
    (println (fib n))))

(-main)
