(ns bee-1101 
  (:require
    [clojure.string :as str]))

(defn read-pair []
  (->> (-> (read-line) 
      (str/split #"\s+"))
      (mapv #(Integer/parseInt %))))

(defn -main [& _]
  (doseq [[m n] (take-while 
                 (fn [[x y]]
                   (and (pos? x) (pos? y)))
                 (repeatedly read-pair))]
    (let [seq (vec (range (min m n) (inc (max m n))))]
      (apply print seq) 
      (println (format " Sum=%d" (reduce + seq))))))

(-main)