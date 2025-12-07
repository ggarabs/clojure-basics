(ns bee-1180 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [_ (Integer/parseInt (read-line))
        x (map read-string (str/split (read-line) #"\s+"))] 
    (println (format "Menor valor: %d" (apply min x)))
    (println (format "Posicao: %d" (first (apply min-key second (map-indexed vector x)))))))

(-main)