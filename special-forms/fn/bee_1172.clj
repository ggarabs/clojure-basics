(ns bee-1172)

(defn -main [& _]
  (let [vct (take 10 (repeatedly #(Integer/parseInt (read-line))))
        x (map (fn [y] (if (or (neg? y) (zero? y)) 1 y)) vct)]
    (doseq [[idx curr] (map-indexed vector x)]
      (println (format "X[%d] = %d" idx curr)))))

(-main)