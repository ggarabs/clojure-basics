(ns run.bee-1070)

(defn -main [& _]
  (let [x (Integer/parseInt (read-line))
        start (if (odd? x) x (inc x))]
    (run! println (range start (+ x 12) 2))))

(-main)