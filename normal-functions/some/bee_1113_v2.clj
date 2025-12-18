(ns normal-functions.some.bee-1113-v2 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (some (fn [equality]
          (when equality true)) 
        (repeatedly 
         (fn [] 
           (let [[x y] (map read-string (str/split (read-line) #"\s+"))] 
             (when (> x y) (println "Decrescente")) 
             (when (< x y) (println "Crescente")) 
             (= x y))))))

(-main)
