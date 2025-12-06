(ns map-indexed.bee-1080)

(defn -main [& _]
  (let [values (vec (take 100 (repeatedly #(Integer/parseInt (read-line)))))]
        (println (apply max values))
        (println (inc (first (apply max-key second (map-indexed vector values)))))))

(-main)