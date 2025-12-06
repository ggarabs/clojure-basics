(ns get.bee-1038
  (:gen-class)
  (:require [clojure.string :as str]))

(def prices {1 4.00 
             2 4.50 
             3 5.00 
             4 2.00 
             5 1.50})
  
(defn -main [& _] 
  (let [[id quantity] (map read-string (str/split (read-line) #"\s+")) 
        total (* quantity (prices id))]
    (println (format "Total: R$ %.2f" total))))

(-main)