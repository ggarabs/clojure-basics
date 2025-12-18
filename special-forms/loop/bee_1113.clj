(ns special-forms.loop.bee-1113 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (loop []
    (let [[x y] (map read-string (str/split (read-line) #"\s+"))]
      (when (not= x y) 
        (cond (> x y) (println "Decrescente")) 
        (cond (< x y) (println "Crescente")) 
        (recur)))))

(-main)