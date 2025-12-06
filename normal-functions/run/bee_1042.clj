(ns run.bee-1042
  (:gen-class) 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [values (map read-string (str/split (read-line) #"\s+"))
        direct-order (sort values)]
    (run! println direct-order)
    (println)
    (run! println values)))

(-main)