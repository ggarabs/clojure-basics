(ns run.bee-1067)

(defn -main [& _]
  (let [x (Integer/parseInt (read-line))]
    (run! println (range 1 (inc x) 2))))

(-main)