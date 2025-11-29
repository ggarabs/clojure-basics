(ns bee-1003
        (:gen-class))

(defn -main [& _]
        (let [a (Integer/parseInt (read-line)) b (Integer/parseInt (read-line))]
                (println (str "SOMA = " (+ a b)))
        )
)

(-main)