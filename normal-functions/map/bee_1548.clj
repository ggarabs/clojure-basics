(ns bee-1548 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))]
    (doseq [_ (range n)]
      (let [_ (Integer/parseInt (read-line))
            values (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
            sorted (sort > values)
            ans (count (filter true? (map = values sorted)))]
        (println ans)))))

(-main)
