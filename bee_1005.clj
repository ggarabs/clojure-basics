(ns bee-1005
        (:gen-class))

(defn -main [& _]
        (let [nota1 (Double/parseDouble (read-line))
              nota2 (Double/parseDouble (read-line))
              media (/ (+ (* nota1 3.5) (* nota2 7.5)) 11)]
           (println (format "MEDIA = %.5f" media))))

(-main)