(ns bee-1174)

(defn -main [& _]
  (let [vetor (take 100 (repeatedly #(Double/parseDouble (read-line))))]
    (doseq [[idx value] (map-indexed vector vetor) 
            :when (<= value 10)]
      (printf "A[%d] = %.1f\n" idx value))))

(-main)