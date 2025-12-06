(ns fn.bee-1075)

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))]
    (run! println (filter #(= 2 (mod % n)) (range 1 10001)))))

(-main)
