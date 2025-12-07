(ns bee-1173)

(defn -main [& _]
  (let [v (Integer/parseInt (read-line))]
    (doseq [idx (range 10)] 
      (println (format "N[%d] = %d" idx (int (* v (Math/pow 2 idx))))))))

(-main)