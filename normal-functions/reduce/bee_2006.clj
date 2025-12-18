(ns normal-functions.reduce.bee-2006 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))
        tea-list (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
    (println (reduce (fn [acc curr] 
                       (if (= n curr) 
                         (inc acc) 
                         acc)) 
                     0 
                     tea-list))))

(-main)