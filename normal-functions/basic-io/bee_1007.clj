(ns basic-io.bee-1007
        (:gen-class))

(defn -main [& _]
        (let [a (Integer/parseInt (read-line))
              b (Integer/parseInt (read-line))
              c (Integer/parseInt (read-line))
              d (Integer/parseInt (read-line))
              dif (- (* a b) (* c d)) ]

              (println (format "DIFERENCA = %d" dif))))

(-main)