(ns macros.doseq.bee-1095)

(defn -main [& _]
  (let [j (range 60 -1 -5)
        i (range 1 (* (count j) 3) 3)]
    (doseq [[x y] (map vector j i)]
      (printf "I=%d J=%d\n" y x))))

(-main)