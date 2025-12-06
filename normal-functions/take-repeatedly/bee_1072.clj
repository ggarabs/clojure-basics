(ns take-repeatedly.bee-1072)

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))
        values (take n (repeatedly #(Integer/parseInt (read-line))))
        in (count (filter #(<= 10 % 20) values))
        out (- n in)] 
    (println in "in")
    (println out "out")))

(-main)