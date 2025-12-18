(ns bee-1175)

(defn -main [& _]
  (let [n (vec (take 20 (repeatedly #(Integer/parseInt (read-line)))))]
    (doseq [[idx value] (map-indexed vector (rseq n))]
      (printf "N[%d] = %d\n" idx value))))

(-main)
