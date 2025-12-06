(ns some.bee-1048
  (:gen-class))

(def table {
            2000 4
            1200 7
            800 10
            400 12
            0 15 })

(defn find-percentage [x]
    (/ (some #(when (> x (first %)) (second %)) table) 100.0))

(defn -main [& _]
  (let [salary (Double/parseDouble (read-line))
        percentage (find-percentage salary)
        raise (* percentage salary)
        new-salary (+ salary raise)]
    (println (format "Novo salario: %.2f" new-salary))
    (println (format "Reajuste ganho: %.2f" raise))
    (println (format "Em percentual: %.0f %%" (* percentage 100)))))

(-main)