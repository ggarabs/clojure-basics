(ns take-repeatedly.bee-1071)

(defn -main [& _]
  (let [[x y] (take 2 (repeatedly #(Integer/parseInt (read-line))))
        odd-values (filter odd? (range (inc (min x y)) (max x y)))
        sum (apply + odd-values)]
    (println sum)))

(-main)