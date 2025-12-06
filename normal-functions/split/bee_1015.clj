(ns split.bee-1015
        (:gen-class))

(require '[clojure.string :as str])
(require '[clojure.math :as math])

(defn dist [[x1 y1] [x2 y2]] 
        (math/sqrt (+ (math/pow (- x2 x1) 2) (math/pow (- y2 y1) 2))))

(defn -main [&  _]
        (let [p1 (map read-string (str/split (read-line) #"\s+"))
             p2 (map read-string (str/split (read-line) #"\s+")) ]

             (println (format "%.4f" (dist p1 p2)))))

(-main)