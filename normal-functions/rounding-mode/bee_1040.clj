(ns rounding-mode.bee-1040
  (:gen-class) 
  (:require
    [clojure.string :as str])
  (:import (java.math BigDecimal RoundingMode)))

(defn round-1 [x]
  (.setScale (BigDecimal. (str x)) 1 RoundingMode/HALF_EVEN))

(defn weighted-mean [n1 n2 n3 n4]
  (round-1 (/ (+ (* n1 2) (* n2 3) (* n3 4) n4) 10)))

(defn -main [& _]
  (let [grades (map read-string (str/split (read-line) #"\s+"))
        mean (apply weighted-mean grades)]
    (println (format "Media: %.1f" mean))

    (cond 
      (>= mean 7.0)
      (println "Aluno aprovado.")

      (< mean 5.0)
      (println "Aluno reprovado.")
      
      :else 
      (let [examGrade (Double/parseDouble (read-line))
                finalMean (/ (+ mean examGrade) 2)] 
        (println "Aluno em exame.") 
        (println (format "Nota do exame: %.1f" examGrade))
        (println (if (>= finalMean 5.0) "Aluno aprovado." "Aluno reprovado." )) 
        (println (format "Media final: %.1f" finalMean))))))

(-main)