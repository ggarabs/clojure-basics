(ns bee-1044
  (:gen-class) 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [[a b] (map read-string (str/split (read-line) #"\s+"))]
    (println (if 
              (or (zero? (mod b a)) 
                  (zero? (mod a b))) 
               "Sao Multiplos" 
               "Nao sao Multiplos"))))

(-main)