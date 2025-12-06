(ns take-repeatedly.bee-1065)

(defn -main [& _]
  (let [values (take 5 (repeatedly #(Integer/parseInt (read-line))))
        even (count (filter even? values))]
    (println even "valores pares")))

(-main)