(ns cond.bee-1037
  (:gen-class))

(defn find-interval [x]
  (cond
    (or (neg? x) (> x 100)) "Fora de intervalo"
    (<= x 25) "Intervalo [0,25]" 
    (<= x 50) "Intervalo (25,50]"
    (<= x 75) "Intervalo (50,75]" 
    :else "Intervalo (75,100]"))

                                                                         
(defn -main [& _]
  (let [value (Double/parseDouble (read-line))]
    (println (find-interval value))))
                                                                         
(-main)
