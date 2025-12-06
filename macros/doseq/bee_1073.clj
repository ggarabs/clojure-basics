(ns doseq.bee-1073)

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))]
  (doseq [x (range 2 (inc n) 2)]
    (println (format "%d^2 = %d" x (* x x))))))

(-main)