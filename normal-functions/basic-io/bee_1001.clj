(ns basic-io.bee-1001
        (:gen-class))

(defn -main [& _]
        (let [a (Integer/parseInt (read-line))
             b (Integer/parseInt (read-line))]
        (println (str "X = " (+ a b))))
)

(-main)
