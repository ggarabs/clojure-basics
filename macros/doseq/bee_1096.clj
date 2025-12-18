(ns macros.doseq.bee-1096)

(defn -main [& _]
  (doseq [i (range 1 10 2)
          j (range 7 4 -1)]
    (printf "I=%d J=%d\n" i j)))

(-main)