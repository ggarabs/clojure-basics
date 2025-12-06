(ns basic-io.bee-1002
        (:gen-class))

(defn -main [& _]
        (let [PI 3.14159
              raio (Double/parseDouble (read-line))]
        (println (str "A=" (format "%.4f" (* PI raio raio)))))
)

(-main)