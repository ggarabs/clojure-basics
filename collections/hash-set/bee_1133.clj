(ns collections.hash-set.bee-1133)

(defn -main [& _]
  (let [x (read-string (read-line))
        y (read-string (read-line))
        minv (inc (min x y))
        maxv (max x y)] 
    (doseq [x (range minv maxv) :when (#{2 3} (mod x 5))] 
      (println x))))

(-main)