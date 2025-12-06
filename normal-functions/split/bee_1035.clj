(ns split.bee-1035
  (:gen-class))

(require '[clojure.string :as str])

(defn accepted? [a b c d]
  (and (> b c)
       (> d a)
       (> (+ c d) (+ a b))
       (pos? c)
       (pos? d)
       (even? a)))

(defn -main [& _]
  (let [[a b c d] (map read-string (str/split (read-line) #"\s+"))]
    (println (if (accepted? a b c d)
               "Valores aceitos" "Valores nao aceitos"))))

(-main)