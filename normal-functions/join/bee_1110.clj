(ns bee-1110 
  (:require
    [clojure.string :as str]))

(defn solve [n]
  (loop [acc []
         curr (apply seq (range n 0 -1))]
    (let [pen (last (butlast curr))]
      (if (= (count curr) 1)
       (conj acc (last curr))
        (recur (conj acc (last curr)) (-> curr
                                          butlast
                                          butlast
                                          (conj pen)))))))

(defn -main [& _]
  (let [lines (take-while #(not (zero? %)) (repeatedly #(Integer/parseInt (read-line))))]
    (doseq [n lines]
      (let [ans (solve n)]
      (println (format "Discarded cards: %s" (str/join ", " (pop ans))))
      (println (format "Remaining card: %d" (last ans)))))))

(-main)